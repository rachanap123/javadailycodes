class demo{
       public static void main(String[] args){
        int x=10;
	int y=20;
	if(x)//error
		System.out.print("hello");
	else
		System.out.println("hiii");
       }
}

//error-incompatible types int cannot be converted to boolean
//so if requires only true or false values in it or whose o/p is 
//true or false(i.e boolean value)
//in above code we have given int value to if so it gives error
//Note - In c if we write same code it will not give error because
//in if except 0 all values it considers as true
