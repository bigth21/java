package lecture.advanced2.was.v6;

import lecture.advanced2.was.httpserver.HttpRequest;
import lecture.advanced2.was.httpserver.HttpResponse;

public class SiteControllerV6 {
    public void site1(HttpRequest request, HttpResponse response) {
        response.writeBody("<h1>Site1</h1>");
    }

    public void site2(HttpRequest request, HttpResponse response) {
        response.writeBody("<h1>Site2</h1>");
    }
}
