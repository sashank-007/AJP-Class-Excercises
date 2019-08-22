abstract class Car {

    abstract void model();
}

class Audi extends Car{

    void model(){
        System.out.println("This is an Audi");
    }
}

class Main3{
    public static void main(String[] args) {
        Audi a = new Audi();
        a.model();
    }
}
