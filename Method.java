class Counter {
    
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class Method {
    public static void main(String[] args) {
        
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        
        System.out.println("Number of Counter instances created: " + Counter.getCount());
    }
}


