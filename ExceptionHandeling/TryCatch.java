package ExceptionHandeling;

public class TryCatch{
    public static void main(String[] args) {
        try {
            int division=10/0;
        } catch (ArithmeticException ae) {
            System.out.println("Division with 0 is not possible");
        }
    }
}