class datatype1{
	public static void main(String[] args){
		float f1=7.5;
		float f2=7.5;

		System.out.println(f1);
		System.out.println(f2);
	}
}
//error-at compile time - possible lossy conversion from double to float.
//While giving float value if we dont write f at end of it - java ignores the float value(4 byte)
//and considers it as double(8 byte) - so the error.
//correction - float f1=7.5f;
