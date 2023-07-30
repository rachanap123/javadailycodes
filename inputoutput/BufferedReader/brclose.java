import java.io.*;
class IODemo{
	public static void main(String[] args) throws IOException{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br1.readLine();
		System.out.println("String1= "+str1);

		br1.close();

		String str2 = br2.readLine();
		System.out.println("String2= "+str2);
	}
}
/* br1.close() - closes connection of 'br' object with keyboard.
 * readLine() method first checks if all connections are proper or not and if
 * connections are not proper it throws IOException.
 *
 * Even if we close one object of Buffered Reader, other objects also cannot
 * take input.
 * Therefore in above code an exception is occured - but at runtime (not at compile time).
 *
 * To handle any exception either - 1) use try catch block
 * 					or
 * 				    2) An exception is thrown to where it has been called from.
 * 				    (So it is thrown to JVM - as main is called from JVM).
 */


