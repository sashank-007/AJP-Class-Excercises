public class ThrowException {
    static void throwExcep() {
        try {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e) {
            System.out.println("Caught inside throwExcep().");
            throw e; // rethrowing the exception
        }
    }
    public static void main(String args[]) {
        try {
            throwExcep();
        }
        catch(NullPointerException e) {
            System.out.println("Caught in main.");
        }
    }
}
