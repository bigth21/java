package basic.access.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("Invoke public method: " + publicField);
    }

    void defaultMethod() {
        System.out.println("Invoke default method: " + defaultField);
    }

    private void privateMethod() {
        System.out.println("Invoke private method: " + privateField);
    }

    public void innerAccess() {
        System.out.println("Inner invocation");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
