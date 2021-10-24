/*Write a program to print multiplication table of n*/
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n;int m;
        int i=1;
        n= s.nextInt();
        while(i<=10) {
            
            m=n*i;
            System.out.println(m);
            i=i+1;
        }
    }
}
