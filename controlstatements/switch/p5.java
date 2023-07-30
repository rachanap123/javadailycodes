
class SwitchDemo{
       public static void main(String[] args){
       int x=3;
       int a=1;
       int b=2;
       switch(x){
	       case a:  // a - variable name , so switch allows only constant values or expressions(1,1+1).
		System.out.println("One");  
	     	break;	
	       case b:
		System.out.println("Two"); 
		break;
	       case a+b:
		System.out.println("Three");
		break;
	       case a+a+b:
		System.out.println("Four");
		break;
	       case a+b+b:
		System.out.println("Five");
		break;
	       default:
		System.out.println("No Match");
		break;
       }
       }
}

/* What will be output of above code? - imp for interview or technical round.
 *
 * Ans:- There will be error for all 5 statements - constant expression required.
 * Switch does not allow variable names as expressions
 * Also String can be written as a case in java (after version 1.7) */
