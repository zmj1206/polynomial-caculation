import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PolynomialCalculator {
    public  static  void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        int[] coeff = new int[100];
        int[] expon = new int[100];
        Polynomial poly0 = new Polynomial();

        //Scanner number = new Scanner(System.in);
        System.out.print("please enter cmd: ");
        while (in.hasNextLine()) {
            String cmd = in.next();

            if ("create 0".equals(cmd)) {

                System.out.println("please enter numbers: ");
                String input = in2.nextLine();
                String[] strs = input.trim().split("\\s+");
                System.out.println(Arrays.toString(strs));
                for (int i = 0; i < strs.length; i+=2) {
                    coeff[i/2] = Integer.parseInt(strs[i]);
                    System.out.print(coeff[i/2]);
                }
                for (int i = 1; i < strs.length; i+=2) {
                    expon[(i-1)/2] = Integer.parseInt(strs[i]);
                    System.out.print(expon[(i-1)/2]);
                }
                System.out.print(Arrays.toString(coeff));
//                int numPolynomial = in.nextInt();
//
//                data1.add(in.nextInt());

            }
        }
    }
}
