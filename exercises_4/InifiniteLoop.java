package exercises_4;

public class InifiniteLoop {

    public static void main(String... args){

        int x =1;
        for (int i =2 ; x<=x; i*=2){

            System.out.println(i);
        }
    }
}
