/*Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
you need to convert all Fahrenheit values from Start to End at the gap of W, 
into their corresponding Celsius values and print the table.*/
import java.util.Scanner;
public class Solution {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int S=s.nextInt();
        int E=s.nextInt();
        int W=s.nextInt();
        int fah;//It is initialize because we need the value in fah

        while(S<=E)// First number to last number of fahereniet
        {
            fah=((5*(S-32))/9);//formula for c to fah conversion
            System.out.println(S+" "+fah);//S is first value and value of fah
            S+=W;//first value with step value
        }
    }
}



