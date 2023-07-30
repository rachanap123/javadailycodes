//Electricity bill problem - (famous problem)
/* Given an int input A whic represents units of electricity consumed in your house.
 * Calculate and print the bill amount.
 * units<=100 : price per unit is 1
 * units>=100 : price per unit is 2
 * Input - 50units
 * output - 50 Rs
 * Input - 200
 * Output - 300
 */

class Bill{
	public static void main(String[] args){
		int bill=200;
		int ans;
		if(bill<=100){
			 ans=bill*1;
			System.out.println(ans);
		}else{
			ans=bill*2-100;
			System.out.println(ans);
		}
	}
}

