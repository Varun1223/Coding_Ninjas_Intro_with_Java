import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int i =n;
        while(1<=i)
        {
            int j=i;
            while (j<=n)//1<=1 1<=2
            {  
            char ch = (char)('A'+j-1);//0 //2-1=1; 3-1=2 //4-1=3
            System.out.print(ch);
                j=j+1;
                
            }
            System.out.println();
            i--;
        }
        
		
	}

}
