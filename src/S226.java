import java.util.Scanner;
import java.util.Stack;

public class S226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            String s= sc.nextLine();
            Stack<Character> st= new Stack<>();
            int m=0;int dem =0;int check=1;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='(')
                {
                    st.push(s.charAt(i));
                }
                if(s.charAt(i)==')')
                {
                    if(!st.isEmpty())
                    {
                        st.pop();
                        m= Math.max(st.size(),m);
                    }
                }
            }
            if(!st.empty() || check ==0) System.out.println("-1");
            else
            {
                System.out.println(m+1);
            }
        }
    }
}
