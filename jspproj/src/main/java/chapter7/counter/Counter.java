package chapter7.counter;

public class Counter {

    private static int count;



    public static int getCount() {
        count++;
        return count;
    }

    public static void setCount(int count) {
        Counter.count = count;
    }
}
