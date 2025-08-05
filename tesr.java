
import java.util.*;

public class tesr {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        float input1 =scanner.nextFloat();
        float input2 =scanner.nextFloat();

        int digit1 =(int) ((input1 * 10 )%10);
        int digit2 =(int) ((input2 * 10)%10);

        if (digit1 >digit2)
        System.out.print(digit1);
        else if (digit2 > digit1)
        System.out.print(digit2);
        else 
        System.out.print("The numbers are equal");
        scanner.close();
    }
}