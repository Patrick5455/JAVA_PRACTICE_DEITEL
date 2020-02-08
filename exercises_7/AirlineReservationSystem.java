package exercises_7;

import java.util.Scanner;
import java.util.Arrays;

public class AirlineReservationSystem {

    static enum Seat {FIRSTCLASS, ECONOMY, OCCUPIED, FREE}

    static Seat seatStatus;
    static Seat seatType;
    static byte newSeat;
    static byte seatNUmber;
    static byte passengerSelect;
    static Scanner scan = new Scanner(System.in);

    static boolean[] seatArray = new boolean[10];

   // Arrays.fill(seatArray, false);

    //Set Default state of AirlineSeat
//    private static void initialiseSeat() {
//        Arrays.fill(seatArray, false);
//    }

    //Passenger select Seat Class
    private static void setClass() {
        System.out.println("Enter 1 for FirstClass and 2 for Economy");
        passengerSelect= scan.nextByte();
        passengerSelect = (byte) (passengerSelect-1);
        assignSeat();

    }

    static byte getClassF(){
        setClass();
        return passengerSelect;
    }

    //Assign seatNo to passengers
   private static void setSeatNo() {
        if (getClassF() == 1) {
            for (byte i = 0; i < 5; i++) {
                if (!seatArray[i]) {
                    seatArray[i] = true;
                    newSeat = i;
                    break;
                }
            }
        }
        if (getClassF() == 2) {
            for (byte i = 5; i < 10; i++) {
                if (!seatArray[i]) {
                    seatArray[i] = true;
                    newSeat = i;
                    break;
                }
            }
        }
    }


    static byte getSeatNo(){
        setSeatNo();
        return newSeat;
    }

    //Assign a seat class based on seat number
    private static Seat assignSeat() {
        int seatN0=getSeatNo();

        if(seatN0>=0 && seatN0<5)
           seatType=Seat.FIRSTCLASS;
        else if(seatN0>=5 && seatN0<9)
            seatType=Seat.ECONOMY;

        return seatType;
    }

    //Check if a particular seat is available
    private static Seat checkSeatAvailability(byte seatNUmber) {
        AirlineReservationSystem.seatNUmber = seatNUmber;
        if (!seatArray[seatNUmber]) {
            seatStatus = Seat.FREE;
        } else {
            seatStatus = Seat.OCCUPIED;
        }
        return seatStatus;
    }

    //Display of Successful transaction
    static void DisplayBoardingPass(){
        System.out.printf("Hello Dear Passenger%nYour seat number is %d and seat class is %s", getSeatNo(), seatType.toString());
    }

    //Check if a particular seat no is available or not.
    static void getSeatAvailability(){
        System.out.println("Enter Seat NUmber to check");
       seatNUmber = scan.nextByte();
       checkSeatAvailability(seatNUmber);
        System.out.printf("The seat is %s", seatStatus.toString());

    }

}




