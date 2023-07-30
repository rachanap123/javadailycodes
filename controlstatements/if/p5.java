//Given an int as input.Print fizz if it is divisible by 3.
//Print buzz if it is divisible by 5. Print fizz-buzz if it is divisible by both.
//If not then print "Not divisible by both"

class Divisible{
	public static void main(String[] args){
		int x = 15;
		if(x%3==0 && x%5==0){
			System.out.println("Fizz-buzz");
		}else if(x%3==0){
			System.out.println("fizz");
		}else if(x%5==0){
			System.out.println("buzz");
		}else{
			System.out.println("Not divisible by both");
		}
	}
}
//Note - In if else ladder sequence of conditions also matters.
