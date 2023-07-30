


class SwitchDemo2{
       public static void main(String[] args){
       int x=5;
       switch(x){
	       case 1: // constant value
		System.out.println("One");
	   	break;	
	       case 1+1: // it becomes easy for compiler to perform addition of constant values
			 // so it easily converts 1+1 into 2 at compile time only and matches condition accordingly.
		System.out.println("Two"); 
		break;
	       case 1+2:
		System.out.println("Three");
		break;
	       case 2+2:
		System.out.println("Four");
		break;
	       case 2+3:
		System.out.println("Five");
		break;
	       default:
		System.out.println("No Match");
       }
       }
}
