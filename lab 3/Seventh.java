import java.util.Scanner;
public class Seventh{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int sum=a+b+c+d+e;
		int percent=sum/5;
		if(percent>=60){
			System.out.println("first division");
		}
		else if(percent<=59||percent>=50){
			System.out.println("second division");
		}
		else if(percent<=49||percent>=40){
			System.out.println("third division");
		}
		else if(percent<40){
			System.out.println("fail");
		}
	}
}