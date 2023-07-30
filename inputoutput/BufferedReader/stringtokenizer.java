/* String Tokenizer - className - its a class present in utility package.
 * This class is used to break string into small parts - called tokens.
 *
 * This class can be used when we want to take multiple inputs from user in one single line only.
 * eg:- sop("Enter matchinfo, manofmatch, runs).
 * After taking multiple inputs they can be broken down into tokens.
 */

import java.io.*;     //for string - BufferedReader
import java .util.*;  // for string Tokenizer class
class StringDemo{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter society name, wing, flat no");
		String info = br.readLine();

		StringTokenizer obj = new StringTokenizer(info," "); //" " - string delimiter (how you want to seperate tokens (, " "))
		
		String token1 = obj.nextToken();
		String token2 = obj.nextToken();
		String token3 = obj.nextToken();

		System.out.println("Society: "+token1);
		System.out.println("Wing: "+token2);
		System.out.println("Flat no: "+token3);
	}
}

/* String Tokenizer has 2 parameters(which string to break into parts, how to seperate strings (by space or comma or anything else)).
 */



