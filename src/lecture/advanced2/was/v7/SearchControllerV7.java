package lecture.advanced2.was.v7;

import lecture.advanced2.was.httpserver.HttpRequest;
import lecture.advanced2.was.httpserver.HttpResponse;
import lecture.advanced2.was.httpserver.servlet.annotation.Mapping;

public class SearchControllerV7 {
    @Mapping("/search")
    public void search(HttpRequest request, HttpResponse response) {
        String q = request.getParameter("q");
        response.writeBody("<h1>Search</h1>");
        response.writeBody("<ul>");
        response.writeBody("<li>query: " + q + "</li>");
        response.writeBody("</ul>");
    }
}
