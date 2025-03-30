import java.util.Scanner;
public class AddTwoNumbers {
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter First Number:");
		int num1=Scanner.nextInt();
		System.out.print("Enter Second Number:");
		int num2=Scanner.nextInt();
		int sum=num1+num2;
		System.out.printlnt("The sum is:"+sum);
	}
}
