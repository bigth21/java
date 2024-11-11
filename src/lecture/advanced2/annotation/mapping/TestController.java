package lecture.advanced2.annotation.mapping;

public class TestController {
    @SimpleMapping("/")
    public void home() {
        System.out.println("TestController.home");
    }

    @SimpleMapping("/page1")
    public void page1() {
        System.out.println("TestController.page1");
    }
}
