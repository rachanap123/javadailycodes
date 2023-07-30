//Real time example 

class Mobile{
	String model_name="Redmi"; // instance var - different for each person
	static int phone_no = 1234567890; // static var - common number given to all contacts

	void info(){
		System.out.println("Model name = "+model_name);
		System.out.println("Phone no="+phone_no);
	}
}
class Main{
	public static void main(String[] args){
		Mobile obj1 = new Mobile();
		Mobile obj2 = new Mobile();
		obj1.info();
		obj2.info();

		System.out.println("----------------");

		obj2.model_name="Samsung";
		obj2.phone_no=98765;

		obj1.info();
		obj2.info();
	}
}






