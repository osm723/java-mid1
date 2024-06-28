package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int iteration = 1_000_000_000;
        long startTime, endTime;

        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("Primitive 시간 = " + (endTime-startTime));


        Long sumWapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            sumWapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWapper = " + sumWapper);
        System.out.println("Wrapper 시간 = " + (endTime-startTime));
    }
}
