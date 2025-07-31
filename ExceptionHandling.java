public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10, b=0;
        try {
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.err.println("You cannot divide a number by 0, you idiot!");
        }
        finally{
            System.out.println("Haha nothing here...");
        }
    }
}