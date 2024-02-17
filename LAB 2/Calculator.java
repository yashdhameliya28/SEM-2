public class Calculator{
	public static void main(String[] args) {
		char ch=args[0].charAt(0);
		int a=Integer.parseInt(args[1]);
		int b=Integer.parseInt(args[2]);
		if(ch=='+'){
			System.out.println(a+b);
		}else if(ch=='-'){
			System.out.println(a-b);
		}else if(ch=='*'){
			System.out.println(a*b);
		}else{
			System.out.println(a/b);
		}
	}
}