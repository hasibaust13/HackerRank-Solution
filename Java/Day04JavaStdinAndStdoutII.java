  
import java.util.Scanner;

/**
 *
 * @author Khan Md. Hasib
 */
public class Day04JavaStdinAndStdoutII {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double f = sc.nextDouble();
        sc.nextLine();
        String line = sc.nextLine();

        System.out.println("String: " + line);
        System.out.println("Double: " + f);
        System.out.println("Int: " +  x);
    }
    
}
