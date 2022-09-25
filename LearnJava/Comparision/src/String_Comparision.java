import java.util.Scanner;
public class String_Comparision {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values of strings");
        
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        int Count=0;
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        
        //logic of programs;
        for(int i=0;i<=c1.length;i++)
        {
        	for(int j=0;j<=c2.length;j++)
        	{
        		if(c1[i] == c2[j]) 
        			System.out.println(c1[i]);
        			Count++;
        			System.out.println(Count);
        	}
        }
        s.close();
	}

}
