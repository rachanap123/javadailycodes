class Bitwise{
	public static void main(String[] args){
		int x = 9;//5
		int y = 14;//7

		System.out.println(x&y);
		System.out.println(x|y);

		int a=8;
		int b=10;

		System.out.println(a&b); //and
		System.out.println(a|b); //or
		System.out.println(a^b); //xor
		//leftshift, right shift

		System.out.println(a<<2);//leftshift
		System.out.println(b>>2);//rightshift




	}
}
/* xor truth table - 00 0
 * 		     01 1
 * 		     10 1
 * 		     11 0
 */
