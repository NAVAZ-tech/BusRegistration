package MiniProject1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Booking {
	  private String passengername;
	  private int busno;
	  private Date date;
	   
	 Booking() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the passenger name to Book:");
		passengername=in.nextLine();
		System.out.println("Enter the busno:");
		busno=in.nextInt();
		System.out.println("Enter the date dd-mm-yyyy");
		String datainput=in.next();
		SimpleDateFormat dataformat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dataformat.parse(datainput);
		} catch (ParseException e) {
			System.out.println("Opps the date format is wrong ... Enter dd-mm--yyyy");
			//e.printStackTrace();
		}
	}
	 
	 public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<BusDetails> buses) {
		 int capacity=0;
		 for(BusDetails bus:buses) {
			 if(bus.getBusnum()==busno)
			 capacity=bus.getSpace();
		 }
		 int booked=0;
		 for(Booking book:bookings) {
			 if(book.busno==busno && book.date.equals(date)) {
				 booked++;
			 }
		 }
		 return booked<capacity?true:false;
	 }

	public String getPassengername() {
		return passengername;
	}
	
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}

	public int getBusno() {
		return busno;
	}

	public void setBusno(int busno) {
		this.busno = busno;
	}

	
	public Date getDate() {
		return date;
	}

	
	public void setDate(Date date) {
		this.date = date;
	} 
	   
	   
}
