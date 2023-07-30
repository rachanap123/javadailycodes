class unary{
	public static void main(String[] args){
		int x=8;
		int y=5;
		int ans1=++x + x++;
		int ans2=--y + y--;
		System.out.println(x);
		System.out.println(y);
	}
}

/* ans1 = ++x + x++ - here first is preincrement so value 8 will change to 9 
 * and now in x we have value as 9.
 * then we have x++ - post increment so here value changes afterwards (less priority)
 * so in x value will remain 9 but while going to next instruction it will become 10.
 * so ++x + x++ = 9+9 = 18 (and value of x will now change to 10)
 * same for decrement operator.
 */
