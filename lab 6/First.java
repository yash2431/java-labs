public class First{
	public static void main(String[] args) {
		int k=1;
		int i,j;
		for(i=1;i<=5;i++){
			for(j=1;j<=5;j++){
				if(i==1 || i==5 || j==1 || j==5){
					System.out.print(k++ + " ");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}