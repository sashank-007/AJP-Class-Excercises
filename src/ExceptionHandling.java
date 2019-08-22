public class ExceptionHandling {

    public static void main(String args[]){
        int a=1,b=0,res = 0;

        try{
            res = a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
