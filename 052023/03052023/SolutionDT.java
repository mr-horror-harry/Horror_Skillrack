import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n=sc.nextInt();
        
        int ptr=s.length()-1;
        while(ptr>=0){
            StringBuilder sb = new StringBuilder("");
            for(int i=0; i<n; i++){
                if(ptr>=0){
                    sb.append(s.charAt(ptr));
                    ptr--;
                }
                else{
                    System.out.print(sb.reverse());
                    return;
                }
            }
            System.out.println(sb.reverse());
        }
        
	}
}