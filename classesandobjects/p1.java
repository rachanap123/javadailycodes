class FlightBooking{
	float price = 3000.75f;
	int seatno = 1215;

	void display(){
		
		System.out.println("Price of ticket is "+price);
		System.out.println("Your seat no is "+seatno);
	}
	
	FlightBooking(){
		System.out.println("Welcome to Indigo Airlines !");
	}


}
class info{ 
	public static void main(String[] args){
		FlightBooking obj=new FlightBooking();
		obj.display();
		
	}
}



