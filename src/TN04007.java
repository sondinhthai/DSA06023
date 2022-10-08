import java.util.*;

public class TN04007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String s = in.nextLine();
            String tmp= chuanHoa(s);
            Stack<Integer> st = new Stack<>();
            int a[] = new int[tmp.length()+1];
            List<Character> list = new ArrayList<>();
            for(int i=0;i<tmp.length();i++){
                list.add(tmp.charAt(i));
            }
            for(int i=0;i<tmp.length();i++){
                if(tmp.charAt(i)=='(') st.push(i);
                else if(tmp.charAt(i)==')'&&!st.empty()){
                    int top = st.peek();
                    if(top==0) {
                        a[top]=1;
                        a[i]=1;
                    }
                    else if(tmp.charAt(top-1)=='+'||tmp.charAt(top-1)=='('){
                        a[top]=1;
                        a[i]=1;
                    }
                    int x=top,y=i;
                    int dem=0;
                    while(x<y){
                        if(a[x]==1&&a[y]==1) dem++;
                        x++;y--;
                    }
                    if((i-top)==(2+2*dem)){
                        a[top]=1;
                        a[i]=1;
                    }
                    st.pop();
                }
            }

            for(int i=0;i<tmp.length();i++){
                if(a[i]==0){
                    System.out.print(tmp.charAt(i));
                }
            }
            System.out.println();
        }

    }

    private static String chuanHoa(String s) {
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            kq.append(tmp);

        }
        return kq.toString().trim();
    }
}
