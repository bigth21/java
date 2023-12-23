package equalshashcode;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        var someThing1 = new SomeThing(1, 1);
        var someThing2 = someThing1;
        System.out.println("someThing1 = " + someThing1);
        System.out.println("someThing2 = " + someThing2);
        // Identity
        System.out.println("someThing1 == someThing2: " + (someThing1 == someThing2));
        // Equality
        System.out.println("someThing1.equals(someThing2): " + someThing1.equals(someThing2));
        System.out.println("null == null: " + (null == null));

        var someThing3 = new SomeThing(2, 2);
        var someThing4 = new SomeThing(2, 2);
        System.out.println("someThing3 = " + someThing3);
        System.out.println("someThing4 = " + someThing4);
        // Identity
        System.out.println("someThing3 == someThing4: " + (someThing3 == someThing4));
        // Equality
        System.out.println("someThing3.equals(someThing4): " + someThing3.equals(someThing4));
        // Null-safe
        System.out.println("someThing3.equals(null): " + someThing3.equals(null));
    }

    public static class SomeThing {
        private int x;
        private int y;

        public SomeThing(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o instanceof SomeThing obj) { // null-safe
                return this.getX() == obj.getX() && this.getX() == obj.getY();
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
