import java.time.LocalDate;
import java.util.ArrayList;

import com.airport.Address;
import com.airport.Airport;
import com.airport.Flight;
import com.airport.Traveller;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Flight> f = new ArrayList<>();
		f.add(new Flight("001","hyd","mumbai",6000,100,100,"12:32:00","12:42:00","AirIndia"));
		f.add(new Flight("002","hyd","mumbai",6500,70,70,"10:32:00","10:42:00","Emerites"));
		f.add(new Flight("003","vizag","hyd",4000,100,100,"11:20:00","11:42:00","AirIndia"));
		f.add(new Flight("004","hyd","mumbai",6000,100,100,"11:20:00","11:42:00","AirIndia"));
		f.add(new Flight("005","hyd","vizag",4400,80,80,"12:32:00","12:42:00","Emerites"));
		
//		Airport airport = new Airport(,ArrayList<Flight> f,);
		Airport airport = new Airport();
		airport.setAddress(new Address("Mindspace","Madhapur","Hyderabad"));
		airport.setFlights(f);
		
		
		Traveller t = new Traveller("Kiran",8328319281L,"kirankumarsingh@gmail.com","005",LocalDate.now());
		airport.bookTicket("004", t);
		
		airport.addFlight(new Flight("006","hyd","mumbai",400,150,150,"00:10:30","00:20:30","KingFisher"));
		for(Flight flight:airport.searchFlightsBySourceAndDestination("hyd", "mumbai"))
				System.out.println(flight);
		System.out.println("Travellers");
		for(Traveller tt:airport.getTravellers())
			System.out.println(tt);
	}

}
