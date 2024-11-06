package lecture.advanced2.was.v5.servlet;

import lecture.advanced2.was.httpserver.HttpRequest;
import lecture.advanced2.was.httpserver.HttpResponse;
import lecture.advanced2.was.httpserver.HttpServlet;

import java.io.IOException;

public class Site2Servlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        response.writeBody("<h1>Site2</h1>");
    }
}
