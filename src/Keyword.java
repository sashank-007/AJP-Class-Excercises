public class Keyword {
    public static void main(String[] args) {
        // a final reference variable stb
        final StringBuilder stb = new StringBuilder("Lamborghini ");
        System.out.println(stb);

        // changing internal state of object
        // reference by final reference variable stb
        stb.append("Huracan Evo 2019");
        System.out.println(stb);
    }
}