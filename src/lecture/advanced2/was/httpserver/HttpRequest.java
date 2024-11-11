package lecture.advanced2.was.httpserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import static java.nio.charset.StandardCharsets.UTF_8;
import static lecture.advanced2.util.MyLogger.log;

public class HttpRequest {
    private String method;
    private String path;
    private final Map<String, String> queryParameters = new HashMap<>();
    private final Map<String, String> headers = new HashMap<>();

    public HttpRequest(BufferedReader reader) throws IOException {
        parseStartLine(reader);
        parseHeaders(reader);
        parseBody(reader);
    }

    private void parseStartLine(BufferedReader reader) throws IOException {
        String startLine = reader.readLine();
        if (startLine == null) {
            throw new IOException("EOF: No start line received");
        }

        String[] parts = startLine.split(" ");
        if (parts.length != 3) {
            throw new IOException("Invalid start line: " + startLine);
        }

        method = parts[0];

        String[] pathParts = parts[1].split("\\?");
        path = pathParts[0];

        if (pathParts.length > 1) {
            parseQueryParameters(pathParts[1]);
        }
    }

    private void parseQueryParameters(String queryString) {
        String[] queryParts = queryString.split("&");
        for (String queryPart : queryParts) {
            String[] queryKeyValue = queryPart.split("=");
            String key = URLDecoder.decode(queryKeyValue[0], UTF_8);
            String value = queryKeyValue.length > 1 ? URLDecoder.decode(queryKeyValue[1], UTF_8) : "";
            queryParameters.put(key, value);
        }
    }

    private void parseHeaders(BufferedReader reader) throws IOException {
        String line;
        while (!(line = reader.readLine()).isEmpty()) {
            String[] headerParts = line.split(":");
            headers.put(headerParts[0].trim(), headerParts[1].trim());
        }
    }

    private void parseBody(BufferedReader reader) throws IOException {
        if (!headers.containsKey("Content-Length")) {
            return;
        }
        int contentLength = Integer.parseInt(headers.get("Content-Length"));
        char[] chars = new char[contentLength];
        int read = reader.read(chars);
        if (read != contentLength) {
            throw new IOException("Invalid body length: " + read + " != " + contentLength);
        }
        String body = new String(chars);
        log("HTTP message body = "+ body);
        String contentType = headers.get("Content-Type");
        if ("application/x-www-form-urlencoded".equals(contentType)) {
            parseQueryParameters(body);
        }
    }

    public String getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }

    public String getParameter(String name) {
        return queryParameters.get(name);
    }

    public String getHeader(String name) {
        return headers.get(name);
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "method='" + method + '\'' +
                ", path='" + path + '\'' +
                ", queryParameters=" + queryParameters +
                ", headers=" + headers +
                '}';
    }
}

