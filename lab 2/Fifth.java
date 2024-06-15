import java.util.Scanner;
public class Fifth{
	public static void main(String[] args){
		char op;
		Scanner c=new Scanner(System.in);
		System.out.println("enter the value of a:");
		Double a=c.nextDouble();
		System.out.println("enter the value of b:");
		Double b=c.nextDouble();
		System.out.println("enter the operator:");
		op=c.next().charAt(0);
		switch(op){
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				System.out.println(a*b);
				break;
			case '/':
				if(b==0){
					System.out.println("invalid");
				}
					else{
						System.out.println(a/b);
					}
					break;
				case '%':
					System.out.println(a%b);
					break;
				default:
					System.out.println("invalid operator");
				}
				}
				} 