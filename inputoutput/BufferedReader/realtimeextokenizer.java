// Real time example of string tokenization.

import java.io.*;
import java.util.*;
class Shopping{
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter shop name, size, noOfClothes, price");
		String info = br.readLine();

		StringTokenizer obj = new StringTokenizer(info," ");

		String token1 = obj.nextToken();
		char token2 = obj.nextToken().charAt(0);
		int token3 = Integer.parseInt(obj.nextToken());
		float token4 = Float.parseFloat(obj.nextToken());

		System.out.println("shop name= " +token1);
		System.out.println("size= " +token2);
		System.out.println("noOfClothes= " +token3);
		System.out.println("price= " +token4);
	}
}
