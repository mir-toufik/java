
import java.util.*;

public class funnction {
    public static int printMyName(String name){
        System.out.println(name);
        return 1 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        String name = sc.next();

        printMyName(name);//call kiya fuction ko...
    }
}