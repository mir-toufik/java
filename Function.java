
import java.util.*;

public class Function {
    public static int calculateproduct(int a,int b){
        
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        
        System.out.println("product of 2 numbers is :"+calculateproduct(a, b));
    }
}