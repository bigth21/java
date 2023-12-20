package basic.static2;

import static basic.static2.DecoData.staticCall;

public class DecoDataMain {

    public static void main(String[] args) {
        staticCall();

        DecoData decoData1 = new DecoData();
        decoData1.instanceCall();

        DecoData decoData2 = new DecoData();
        decoData2.instanceCall();
    }
}
