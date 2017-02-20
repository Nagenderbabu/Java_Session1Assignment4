
public class Expressions {

	public static void main(String[] args){
		// initializing two integers x and y variables
		int x=5;
		int y=10;
		// In this first expression the operator precedence follows
		//so firstly * operator 
		int a=x+y*2;
		
		System.out.println(a);

		int b=x-y+2;
		System.out.println(b);
		
		int c=(x+y)*2;
		System.out.println(c);
	
	    int d=y%x;
	    System.out.print(d);
	}
}
