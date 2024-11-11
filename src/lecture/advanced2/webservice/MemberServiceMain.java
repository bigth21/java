package lecture.advanced2.webservice;

import lecture.advanced2.io.member.impl.FileMemberRepository;
import lecture.advanced2.was.httpserver.HttpServer;
import lecture.advanced2.was.httpserver.HttpServlet;
import lecture.advanced2.was.httpserver.ServletManager;
import lecture.advanced2.was.httpserver.servlet.DiscardServlet;
import lecture.advanced2.was.httpserver.servlet.annotation.AnnotationServletV3;

import java.io.IOException;
import java.util.List;

public class MemberServiceMain {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        HttpServlet servlet = new AnnotationServletV3(List.of(new MemberController(new FileMemberRepository())));

        ServletManager servletManager = new ServletManager();
        servletManager.add("/favicon.ico", new DiscardServlet());
        servletManager.setDefaultServlet(servlet);

        HttpServer server = new HttpServer(PORT, servletManager);
        server.start();
    }
}
