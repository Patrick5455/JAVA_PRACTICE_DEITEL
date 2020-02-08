package exercises_7;

import java.util.Scanner;
import java.util.Arrays;
public class SalesAggregator {

    private static int salesManNum; private  static int  productNUm; private static int totalProductSale;
     static int [] [] salesBook = new int [5] [20];
    static Scanner scan = new Scanner(System.in);

    public SalesAggregator(int salesManNum, int productNUm, int totalProductSale){
        SalesAggregator.salesManNum = salesManNum;
        SalesAggregator.productNUm = productNUm;
        SalesAggregator.totalProductSale = totalProductSale;
    }

    //Collect salesmanId
    private static int salesmanId(){
        System.out.println("Please enter your salesman Id/No");
        salesManNum = scan.nextInt();

        return salesManNum;
    }

    //Collect productNo
    private static int productNo(){
        System.out.println("Please enter your product No");
        productNUm = scan.nextInt();

        return productNUm;
    }

    //Collect totalProductSale
    private static int productSale(){
        totalProductSale = scan.nextInt();

        return totalProductSale;
    }

    private static void storeRecord(){
        byte productCount = 0; byte productLimit =4;
        for (byte product=0; product<salesBook.length; product++){
            System.out.printf("Input sales record for Product %d%n",product+1);
            byte salesMan =0;
            for(byte productSale =productCount; productSale<productLimit; salesMan++,  productSale++){
                System.out.printf("Please enter your total sales for Sales Man %d%n",salesMan+1);
                salesBook[product][productSale]=productSale();
            }
            productCount+=4; productLimit+=4;
        }
    }

    private static void displayRecord(){
        System.out.println("\t\t\t\tSalesMan 1\t\tSalesMan 2\t\tSalesMan 3\t\tSalesMan 4\t\tTotal Sales\n");
        byte productCount =0; byte x =0;

        //Get the value for product sales in the array
        byte pTotalIndex =0;

        for(int[] product : salesBook){
            int productTotal =0;
            //Increments the index position of each column to calculate for salesman
            System.out.printf("Product %d",x++);
            for(int salesMan=productCount; salesMan<productCount+4; pTotalIndex++, salesMan++){
                System.out.printf("%,15d", product[salesMan]);
                productTotal+=product[pTotalIndex];
            }
            System.out.printf("%,15d",productTotal);
            System.out.println();
            System.out.println();
            productCount+=4;
            if(x==5) System.out.print("Total Sales");
        }
//        byte y = 0;
//        for(int[] product : salesBook) {
//            int salesManTotal = 0;
//            byte sTotalIndex = 0;
//            y++;
//            sTotalIndex = y;
//            for (int salesMan = 0; salesMan<1; sTotalIndex += 4, salesMan++) {
//                salesManTotal += salesBook[salesMan][sTotalIndex];
//                System.out.printf("%,15d",salesManTotal);
//            }
//        }
    }

public static void main(String... args){

    storeRecord();
    SalesAggregator.displayRecord();

    }

}
