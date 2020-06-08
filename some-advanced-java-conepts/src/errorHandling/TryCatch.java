package errorHandling;

public class TryCatch {

    public static void main(String... args) throws ArithmeticException , ArrayIndexOutOfBoundsException

    {

        try{
            int  [] b =  new int [2];
            int x = 100/0;

            System.out.println(b[34]);
        //System.out.println(x);


    }
        catch (ArithmeticException e){
            e.printStackTrace();
        }


        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        // general purpose exception
        catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("---------------------");
        System.out.println("Exception was handled");
    }
}
