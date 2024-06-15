import java.util.Scanner;
public class Nineth{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=1;
		for(int i=1;i<=a;i++){
			if(a%i==0){
				b++;
			}
		}
		if(b>2){
				System.out.println("not prime no.");
			}
			else{
				System.out.println("prime no.");
			}
		}
	}