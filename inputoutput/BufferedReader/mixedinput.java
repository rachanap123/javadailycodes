import java.io.*;
class PlayerInfo1{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter name: ");
		String name = br.readLine();

		System.out.println("Enter jerNo: ");
		int jerNo = Integer.parseInt(br.readLine());

		System.out.println("Enter average: ");
		float avg = Float.parseFloat(br.readLine());

		System.out.println(name);
		System.out.println(jerNo);
		System.out.println(avg);
	}
}

/*In BufferedReader class int,float cannot be explicitly typecasted - so therefore
 * we use Wrapper class - Integer then parse it to convert it into a compatible type.
 *
 * In Scanner class - it automatically takes wrapper class and parses it - to make our work
 * easier.
 */
