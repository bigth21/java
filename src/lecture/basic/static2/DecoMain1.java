package lecture.basic.static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "Hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);
        System.out.println("s = " + s);
        System.out.println("deco = " + deco);
    }
}
