package exercises_7;

public class CMDRemix {

    public static void main(String... args){

        int arrayLength = Integer.parseInt(args[0]); //1
        int array [] = new int [arrayLength];

        int initialValue = Integer.parseInt(args[1]); //2
        array [0] = initialValue;
        int incrementValue = Integer.parseInt(args[2]); //3



        System.out.printf("Index\tValue");
       for(int a =0; a<array.length; a++){

           array [a] = initialValue + a * incrementValue;
           System.out.printf("%d\t%d", a, array[a]);
       }
    }
}
