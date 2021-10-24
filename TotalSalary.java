/* Write a program to calculate the total salary of a person. 
The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
totalSalary = basic + hra + da + allow – pf */
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int basic = in.nextInt();
        String t = in.next();	
        
        
        int allow;
        double totalSalary;
        double hra = basic * 0.2;
        double da = basic * 0.5;
        double pf = basic * 0.11;

        switch (t){
            case "A":    
                allow = 1700;
                totalSalary = basic + hra + da + allow - pf;
                System.out.println(Math.round(totalSalary));
                break;
                
            case "B" :
                allow = 1500;
                totalSalary = basic + hra + da + allow - pf;
                System.out.println(Math.round(totalSalary));
                break;
            default :
                allow = 1300;
                totalSalary = basic + hra + da + allow - pf;
                System.out.println(Math.round(totalSalary));
        }
    }
}
