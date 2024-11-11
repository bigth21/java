package lecture.advanced2.annotation.basic;

@AnnoMeta
public class MetaData {
//    @AnnoMeta
    private String id;

    @AnnoMeta
    public void call(){}

    public static void main(String[] args) throws NoSuchMethodException {
        AnnoMeta annotation1 = MetaData.class.getAnnotation(AnnoMeta.class);
        System.out.println("annotation1 = " + annotation1);

        AnnoMeta annotation2 = MetaData.class.getMethod("call").getAnnotation(AnnoMeta.class);
        System.out.println("annotation2 = " + annotation2);
    }
}
