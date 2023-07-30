//simple switch program

class SwitchDemo{
       public static void main(String[] args){
       int x=3;
       switch(x){
	       case 1:
		System.out.println("One");     
	       case 2:
		System.out.println("Two"); 
	       case 3:
		System.out.println("Three");
	       case 4:
		System.out.println("Four");
	       case 5:
		System.out.println("Five");
	       default:
		System.out.println("No Match");
       }
       }
}
/*o/p:- Three
 *	Four
 *	Five
 *	No Match
 *This is because after any condition is matched with the block of case(here it tries to match x which is 3 with  every
 case number) it considers all lines after it as one whole block - as we have not specified break statement here.
 Note - default has lower priority so its checked at last - but we can write it in between anywhere of code but then it will require break 
 statement
 */
