package lecture.advanced2.network.tcp.autocloseable;

public class ResourceCloseMainV4 {
    public static void main(String[] args) {
        try {
            logic();
        } catch (CallException e) {
            System.out.println("Handle CallException");
            e.printStackTrace();
        } catch (CloseException e) {
            System.out.println("Handle CloseException");
            e.printStackTrace();
        }
    }

    private static void logic() throws CallException, CloseException {
        try (ResourceV2 resource1 = new ResourceV2("resource1");
             ResourceV2 resource2 = new ResourceV2("resource2")) {
            resource1.call();
            resource2.callEx();
        } catch (CallException e) {
            System.out.println("Ex: " + e);
            for (Throwable throwable : e.getSuppressed()) {
                System.out.println("Suppressed: " + throwable);
            }
            throw e;
        }
    }
}
