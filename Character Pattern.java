import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int i =1;int p=1;
        while(i<=n)
        {
            int j=1;
        	 p =i;//
            while (j<=i)//1<=1 1<=2
            {  
            char ch = (char)('A'+p-1);//0 //2-1=1; 3-1=2 //4-1=3
            System.out.print(ch);
               p=p+1; j=j+1;
                
            }
            System.out.println();
            i+=1;
        }
        
		
	}

}
