package lecture.basic.polymorphism.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        Parent poly = new Child();

        // Temporary down casting
        ((Child) poly).childMethod();
    }
}
