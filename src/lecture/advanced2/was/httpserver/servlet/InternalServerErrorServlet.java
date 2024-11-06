package lecture.advanced2.was.httpserver.servlet;

import lecture.advanced2.was.httpserver.HttpRequest;
import lecture.advanced2.was.httpserver.HttpResponse;
import lecture.advanced2.was.httpserver.HttpServlet;

import java.io.IOException;

public class InternalServerErrorServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        response.setStatusCode(500);
        response.writeBody("<h1>500 Internal Server Error</h1>");
    }
}
