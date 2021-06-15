package exception;

public class AutoCloseTest {
    public static void main(String[] args) {
        try (AutoCloseObj obj = new AutoCloseObj()){
            throw new java.lang.Exception();

        } catch (java.lang.Exception e) {
            System.out.println("exception");
        }
    }
}
