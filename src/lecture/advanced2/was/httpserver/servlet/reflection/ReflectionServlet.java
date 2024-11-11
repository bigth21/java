package lecture.advanced2.was.httpserver.servlet.reflection;

import lecture.advanced2.was.httpserver.HttpRequest;
import lecture.advanced2.was.httpserver.HttpResponse;
import lecture.advanced2.was.httpserver.HttpServlet;
import lecture.advanced2.was.httpserver.PageNotFoundException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class ReflectionServlet implements HttpServlet {
    private final List<Object> controllers;

    public ReflectionServlet(List<Object> controllers) {
        this.controllers = controllers;
    }

    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        String path = request.getPath();
        for (Object controller : controllers) {
            Class<?> clazz = controller.getClass();
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                String name = method.getName();
                if (path.equals("/" + name)) {
                    invoke(controller, request, response, method);
                    return;
                }
            }
        }
        throw new PageNotFoundException("request" + path);
    }

    private static void invoke(Object controller, HttpRequest request, HttpResponse response, Method method) {
        try {
            method.invoke(controller, request, response);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
