package exercises_7;

public class CMDSum {

    public static void main (String... args){
    double total =0;
        for (String num : args){
            double numM = Double.parseDouble(num);
            total+=numM;
        }

        System.out.printf("Total value passed in the array is %d", total);
    }
}
