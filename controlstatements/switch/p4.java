
class SwitchDemo4{
       public static void main(String[] args){
       int  ch=65;
       switch(ch){
	       case 'A':
		System.out.println("A");
	   	break;	
	       case 65:
		System.out.println("65");
	       break;	
	       case 'B':
		System.out.println("B");
		break;
	       case 66:
		System.out.println("66");
		break;
	  
	       default:
		System.out.println("No Match");
		break;
       }
       }
}


/* What will be output of above code - imp Q for interview/technical round.
 *
 * Ans:- there will be an error - case 65 and case 66 - duplicate case label
 * as we know that char internally goes as int only
 * so compiler will convert A to 65 which is its ASCII value and therefore the error
 */
