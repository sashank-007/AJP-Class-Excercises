abstract class Motorbike {
        public String model;
        public int year;

        public Motorbike(String model, int year)
        {
            this.model = model;
            this.year = year;
        }

        // toString() method to print info of Motorbike
        public String toString()
        {
            return("Model of bike "+model
                    +"\n"
                    + "year of Motorbike is "+year);
        }
    }

    // derived class
    class Honda extends Motorbike {
     public Honda(String model, int year) {
            // invoking base-class(Motorbike) constructor
            super(model, year);
        }
    }

    // driver class
    class Main1 {

        public static void main(String args[])
        {
            Honda mb = new Honda("Fireblade", 2019);
            System.out.println(mb.toString());
        }

    }

