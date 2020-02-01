//package RandomAlgorithm;
//
//import java.util.Scanner;
//import java.util.Arrays;
//import java.security.SecureRandom;
//public class ArrayBinarySearch {
//
//   static  Scanner input = new Scanner(System.in);
//   static SecureRandom randomValue = new SecureRandom();
//   static int [] array; static int searchValue; static int arraySize;
//
//    public static void main (String... args){
//    }
//
//    static void setArray() {
//        System.out.println("Enter size of array");
//        arraySize = input.nextInt();
//        array = new int[arraySize];
//        int arrayValues = 1 + randomValue.nextInt(arraySize);
//        searchValue = 1 + randomValue.nextInt(arraySize);
//
//        for (int index = 0; index < array.length; index++) {
//            array[index] = arrayValues;
//            // System.out.printf("%d ", array[index]);
//            Arrays.sort(array);
//        }
//    }
//
//    static int[] getArray(){
//            System.out.println("Sorted Array List");
//            return array;
//        }
//
//
//        //System.out.println(array);
//
//    public int binarySearch(int[] array, int searchValue){
//        ArrayBinarySearch.array = array;  ArrayBinarySearch.searchValue = searchValue;
//
//        if(array.length<1)
//            System.out.println("False");
//        else {
//            int midPoint = (int) array.length / 2;
//
//            if (array[midPoint]==searchValue)
//                System.out.printf("True at index %d%n", midPoint);
//
//            else if (array[midPoint]>searchValue){
//                array = array[]
//            }
//        }
//
//
//
//
//    }
//}
