import java.util.Scanner;
public class Sixth{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number:");
			int a=sc.nextInt();
			int temp=a;
			int sum=0,r;
			while(a>0){
				r=a%10;
				sum=(sum*10)+r;
				a=a/10;
			}
			if(temp==sum){
				System.out.println("palindrome no.");
			}
			else{
				System.out.println("not palindrome");
			}
	}
}