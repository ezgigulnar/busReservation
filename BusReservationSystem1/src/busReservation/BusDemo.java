package busReservation;
import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {
    public  static void main(String[] args) {

        ArrayList<Bus> buses =new ArrayList<Bus>();
        ArrayList<Booking>bookings=new ArrayList<Booking>();

        buses.add(new Bus(1, true,45));
        buses.add(new Bus(2, true,50));
        buses.add(new Bus(3, true,48));


        int userOpt = 1;
        Scanner scanner=new Scanner(System.in);

        for (Bus b:buses){
            b.displayBusInfo();

        }
        while(userOpt == 1) {
            System.out.println("enter 1 to book and 2 to exit");
            userOpt= scanner.nextInt();
            if(userOpt==1){
                Booking booking=new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("your booking is confirmed");

                }
                else
                    System.out.println("Sorry, bus is full.Try another bus or date.");

            }
        }
    }
}
