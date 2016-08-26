import java.util.Scanner;
public class alpha {
	public static void main(String[] args)throws java.io.IOException {
		char c;
		Scanner in= new Scanner(System.in);
		c=(char)System.in.read();
		if(Character.isLetter(c))
			System.out.println("the given value ia alpha");
		else
			System.out.println("the given number is not alpha");

	}

}

