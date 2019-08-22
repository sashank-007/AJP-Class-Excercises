interface model
{
    public void print_model();
}

interface year
{
    public void print_year();
}

interface company extends model, year
{
    public void print_model();
}
class MultipleInheritance implements company {
    @Override
    public void print_model() {
        System.out.println("Africa Twin");
    }

    public void print_year() {
        System.out.println("2019");
    }
}

// Drived class
class Main2
{
    public static void main(String[] args)
    {
        MultipleInheritance mul = new MultipleInheritance();
        mul.print_model();
        mul.print_year();
        mul.print_model();
    }
} 