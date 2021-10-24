import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int i=n;
            
        while(1<=i)
            {
            int j=1;
            while (j<=i){
                System.out.print(i);
                j= j+1;
            }
            System.out.println();
            i--;
        }
        

		
	}

}
