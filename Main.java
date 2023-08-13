package MiniProject1;
import java.util.Scanner;
import java.util.ArrayList;
public class package MiniProject1;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	
static void Menu() {
	System.out.println("Welcome to Navaz Traval Services ");
	System.out.println("Enter '1'for view Details of our Bus");
	System.out.println("Enter '2' for Booking");
	System.out.println("Enter '3' for Exit");
}
	public static void main(String[] args) {
		ArrayList<BusDetails> buses=new ArrayList<BusDetails>();
		buses.add(new BusDetails("RIO",1,"Chennai-Erode",2,true));
		buses.add(new BusDetails("FLYER",2,"Karur-Erode",1,false));
		buses.add(new BusDetails("KING",3,"Kerala-coimbatore",8,true));
		buses.add(new BusDetails("MARAN",4,"Delhi-Chennai",5,true));
		
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		
		Scanner in=new Scanner(System.in);
		int option;
	   
	    
		do {
			Menu();
			option=in.nextInt();
			switch(option) {
			case 1:
				System.out.println("These are the Bus details");
				 for(BusDetails b:buses) {
						b.Display();
					    }
				 break;
			case 2:
				System.out.println("Booking...");
				Booking booking=new Booking();
				   if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your Booking is Confrimed");
				}
				   else {
					   System.out.println("Oops there is no availabiliity in that bus ..try another bus or date");
				   }
				   break;
			}
		}while(option<=2);
		System.out.println(" Thank You\n Enjoy Your jorney\n Visit Again");
		
	}
	}

 {
	
static void Menu() {
	System.out.println("Welcome to Navaz Traval Services ");
	System.out.println("Enter '1'for view Details of our Bus");
	System.out.println("Enter '2' for Booking");
	System.out.println("Enter '3' for Exit");
}
	public static void main(String[] args) {
		ArrayList<BusDetails> buses=new ArrayList<BusDetails>();
		buses.add(new BusDetails("RIO",1,"Chennai-Erode",2,true));
		buses.add(new BusDetails("FLYER",2,"Karur-Erode",1,false));
		buses.add(new BusDetails("KING",3,"Kerala-coimbatore",8,true));
		buses.add(new BusDetails("MARAN",4,"Delhi-Chennai",5,true));
		
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		
		Scanner in=new Scanner(System.in);
		int option;
	   
	    
		do {
			Menu();
			option=in.nextInt();
			switch(option) {
			case 1:
				System.out.println("These are the Bus details");
				 for(BusDetails b:buses) {
						b.Display();
					    }
				 break;
			case 2:
				System.out.println("Booking...");
				Booking booking=new Booking();
				   if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your Booking is Confrimed");
				}
				   else {
					   System.out.println("Oops there is no availabiliity in that bus ..try another bus or date");
				   }
				   break;
			}
		}while(option<=2);
		System.out.println(" Thank You\n Enjoy Your jorney\n Visit Again");
		
	}
	}

