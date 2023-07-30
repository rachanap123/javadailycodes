
class SwitchDemo1{
       public static void main(String[] args){
       int x=5;
       switch(x){
	       case 1:
		System.out.println("1");
	   	break;	
	       case 2:
		System.out.println("2");
	        break;	
	       case 5:
		System.out.println("First-5");
		break;
	       case 5:
		System.out.println("Second-5");
		break;
	       case 2:
		System.out.println("Second-2");
		break;
	       default:
		System.out.println("No Match");
		break;
       }
       }
}
/* case1 -this is called as a label
 * In switch duplicate cases are not allowed - so it gives duplicate case label
 */
