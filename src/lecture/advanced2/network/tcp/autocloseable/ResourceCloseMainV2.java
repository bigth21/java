package lecture.advanced2.network.tcp.autocloseable;

public class ResourceCloseMainV2 {
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
        ResourceV1 resource1 = null;
        ResourceV1 resource2 = null;
        try {
            resource1 = new ResourceV1("resource1");
            resource2 = new ResourceV1("resource2");
            resource1.call();
            resource2.callEx();
        } catch (CallException e) {
            System.out.println("Ex: " + 2);
            throw e;
        } finally {
            if (resource2 != null) {
                resource2.closeEx();
            }
            if (resource1 != null) {
                resource1.closeEx();
            }
        }
    }
}
