import java.util.Scanner;
class DreamCompany{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your dream company");
		String name = obj.next();

		System.out.println("Enter expected package");
		float sal = obj.nextFloat();

		System.out.println(name);
		System.out.println(sal);
	}
}

/* Whenever we create object of scanner class (obj) - then a connection with keyboard 
 * will be made to take the input from user with scanner class
 */
