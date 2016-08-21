import java.util.*;
public class posneg {
public static void main(String[] arg)
{
	int x;
	System.out.print("enter the number:");
	Scanner in=new Scanner(System.in);
	x=in.nextInt();
	if(x>0)
		System.out.print("The given number is positive");
	else if(x<0)
		System.out.print("The given number is negative");
	else
		System.out.print("The given number is zero");
}
}
