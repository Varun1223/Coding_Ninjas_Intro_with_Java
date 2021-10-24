/*Coding_Ninjas_Intro_with_Java
Getting Started with Java*/
/*Finding Average Marks*/ 
 import java.util.Scanner;
public class Solution {
   
	public static void main(String[] args) {
		/*int a
        int b
        int c
        Avg = a+B+c/3
        print avg
        */
        int a,b,c,d;
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char ch =str.charAt(0);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d = ((a+b+c)/3);
        System.out.println(ch);
        System.out.println(d);
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
