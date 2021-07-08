import java.util.Scanner;

public class bhaskar {
    public static void main(String args[]){

        System.out.println("Type a, b, c");
        Scanner scan = new Scanner(System.in);

        System.out.println("Type a: ");
        float a = scan.nextFloat();
        System.out.println("Type b: ");
        float b = scan.nextFloat();
        System.out.println("Type c: ");
        float c = scan.nextFloat();
        
        double xPos = (-b+Math.sqrt(b*b-4*a*c))/2*a;
        double xNeg = (-b-Math.sqrt(b*b-4*a*c))/2*a;
        System.out.println("x Positive: "+xPos+"\nx Negative: "+xNeg+"\n");
    }
}
