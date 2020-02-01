package classworks_assignments;
public class SixMultiplesSkip {
    public static void main (String... args){
        int total =0; int counter =0;
        while (counter <7){
            counter++;
            total+=counter;
           if (total%6==0) total=total-counter;
        }
        System.out.println(total);
    }
}
