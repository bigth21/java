package lecture.advanced2.reflection;

import lecture.advanced2.reflection.data.Calculator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MethodV3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        String methodName = sc.nextLine();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Calculator calculator = new Calculator();
        Class<? extends Calculator> calculatorClass = calculator.getClass();
        Method method = calculatorClass.getDeclaredMethod(methodName, int.class, int.class);
        Object returnValue = method.invoke(calculator, num1, num2);
        System.out.println("returnValue = " + returnValue);
    }
}
