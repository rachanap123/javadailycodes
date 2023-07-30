//Take 2 integers A and B as input. Print max of 2. The 2 integers can be equal also.

class P2{
	public static void main(String[] args){
		int a=5;
		int b=5;
		if(a>b){
			System.out.println(a+ " is greater");
		}else if(b>a){
			System.out.println(b+ " is greater");
		}else{
			System.out.println("Both are equal");
		}
	}
}
