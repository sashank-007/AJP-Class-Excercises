public class ThrowsException {
    static void throwsExcep() throws IllegalAccessException {
        System.out.println("Inside throwsExcep(). ");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) {
        try {
            throwsExcep();
        }
        catch(IllegalAccessException e) {
            System.out.println("caught in main.");
        }
    }
}
