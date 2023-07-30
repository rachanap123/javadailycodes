import java.io.*;
class PlayerInfo{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter batsman name: ");
		String name1 = br.readLine();

		System.out.println("Enter bowler name: ");
		String name2 = br.readLine();

		System.out.println("batsman name: "+name1);
		System.out.println("bowler name: "+name2);
	}
}
/* To input string from user in BufferedReader class, readLine() method
 * is used.
 * readLine() method "\n" paryanta ch vachte - so he method \n nahi vachat.
 */

