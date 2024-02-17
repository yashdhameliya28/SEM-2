import java.util.Scanner;
public class VowelsCheck{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ch=sc.next();
		System.out.println("Entetr a string");
		for(int i=0 ; i<ch.length() ; i++){
			if(ch.charAt(i)== 'a' || ch.charAt(i)=='e' || ch.charAt(i)=='i'||  ch.charAt(i)=='o' ||  ch.charAt(i)=='u'){
				System.out.println("vowels alphabet "+ch.charAt(i));
			}else{
				System.out.println("consonants alphabet "+ch.charAt(i));
			}
		}
	}
}