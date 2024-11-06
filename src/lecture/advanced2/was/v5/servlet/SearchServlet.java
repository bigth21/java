package lecture.advanced2.was.v5.servlet;

import lecture.advanced2.was.httpserver.HttpRequest;
import lecture.advanced2.was.httpserver.HttpResponse;
import lecture.advanced2.was.httpserver.HttpServlet;

import java.io.IOException;

public class SearchServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        String q = request.getParameter("q");
        response.writeBody("<h1>Search</h1>");
        response.writeBody("<ul>");
        response.writeBody("<li>query: " + q + "</li>");
        response.writeBody("</ul>");
    }
}
