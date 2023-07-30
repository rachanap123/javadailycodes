import java.util.Scanner;
class ScannerDemo{
	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter name");
		String name = obj.next();
		System.out.println(name);
	}
}
/* Here if we dont write import statement - it will give 2 errors on line-
 * Scanner obj = new Scanner(System.in); - as child reference and parent object not allowed in java.
 */
