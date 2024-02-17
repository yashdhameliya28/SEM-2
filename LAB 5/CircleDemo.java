// public class CircleDemo {
//     public static void main(String[] args){
//         Circle c1 = new Circle();
//         c1.radius = 2;
//         c1.findArea();

//     }
    
// }



import java.util.Scanner;
public class CircleDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.print("Enter radius:");
        c1.radius = sc.nextInt();
        c1.findArea();
    }
}