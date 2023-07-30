import java.io.*;
class Society{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter name: ");
		String name = br.readLine();

		System.out.println("Enter Wing: ");
		char wing = (char)br.read();

		br.skip(1);

		System.out.println("Enter flat no: ");
		int No = Integer.parseInt(br.readLine());

		System.out.println(name);
		System.out.println(wing);
		System.out.println(No);
	}
}

/* To read input of char in BufferedReader class - read() method is used. (here we also have to typecast it) 
 * br.skip(1) - As we know after entering wing name - char -\n is entered into pipe - so when \n is there in pipe
 * it does not wait to take the next input, it directly goes to next line by skipping it.
 * br.skip(1) - is used to skip \n char only once.
 */




		
