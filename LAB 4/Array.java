import java.util.Scanner;
public class Array{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] a=new int[4];
		int sum=0;
		System.out.println("Enter four number");
		for(int i=0; i<4; i++){
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		double avg=sum/4;
		System.out.println(avg);
	}
}