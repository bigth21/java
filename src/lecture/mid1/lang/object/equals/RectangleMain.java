package lecture.mid1.lang.object.equals;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 6);
        Rectangle rect2 = new Rectangle(4, 6);

        System.out.println("rect1 = " + rect1);
        System.out.println("rect2 = " + rect2);
        System.out.println("identity = " + (rect1 == rect2));
        System.out.println("equalirt = " + (rect1.equals(rect2)));
    }
}
