class datatype{
	public static void main(String[] args){
		byte var1=18;
		byte var2=18;

		System.out.println(var1);
		System.out.println(var2);

		var1= var1+var2; // here error comes at runtime

		System.out.println(var1);
		System.out.println(var2);
	}
}
/* error- possible lossy conversion from int to byte
 * var1=var1+var2 = 2 datatypes addition is done at runtime 
 * and java considers any no generated at run time as int
 * so as in var1 we are storing addition of byte no.s which will be an int no. at runtime(after addition)
 * so the error.

