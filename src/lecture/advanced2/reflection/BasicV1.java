package lecture.advanced2.reflection;

import lecture.advanced2.reflection.data.BasicData;

public class BasicV1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<BasicData> basicDataClass1 = BasicData.class;
        System.out.println("basicDataClass1 = " + basicDataClass1);

        BasicData basicDataInstance = new BasicData();
        Class<? extends BasicData> basicDataClass2 = basicDataInstance.getClass();
        System.out.println("basicDataClass2 = " + basicDataClass2);

        String className = "lecture.advanced2.reflection.data.BasicData";
        Class<?> basicDataClass3 = Class.forName(className);
        System.out.println("basicDataClass3 = " + basicDataClass3);
    }
}
