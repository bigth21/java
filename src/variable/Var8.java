package variable;

public class Var8 {

    public static void main(String[] args) {
        // Integer
        byte b = 127; // 1 byte: -2^7 ~ 2^7-1
        short s = 32_767; // 2 byte: -2^15 ~ 2^15-1
        int i = 2_147_483_647; // -2^31 ~ 2^31-1
        long l = 9_223_372_036_854_775_807L; // -2^63 ~ 2^63-1

        // Real Number
        float f = 10.0f; // 4 byte: 1.4e-45 ~ 3.4e38, precision: 7
        double d = 10.0; // 8 byte: 4.9e-324 ~ 1.8e308, precision: 15
    }
}
