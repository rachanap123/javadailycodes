class nonstaticvar{
	int x=10; //global var - non-static var or instance var in java
	public static void main(String[] args){
		int y=20;// local var
		
		System.out.println(x);
		System.out.println(y);
	}
}
/* only var are given a specific box inside jvm
 * int x=10 - will go in heap section -(but in heap when we create obj then only memory is given to that var)
 * and in heap section without creation of object the var will not come into picture so if we try to access the var
 * it will give error - "non-static var x cannot be referenced from a static context"
 * "static context" = inside main method its a static area so main method is static and int x will be non static var for main.
 * int y=20 - will go in java stack
 */
