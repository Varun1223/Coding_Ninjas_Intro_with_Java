import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=i){
                char ch = (char)('A'+i-1);
                    System.out.print(ch);
                j++;
            }
            System.out.println();
            i=i+1;
        }
		
	}

}
