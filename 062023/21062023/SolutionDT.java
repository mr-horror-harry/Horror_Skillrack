import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt(), x = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<m; i++){
            String ar[] = sc.nextLine().split(" ");
            
            StringBuilder sb = new StringBuilder("");
            for(String s:ar){
                sb.append((s+" ").repeat(x));
            }
            
            for(int j=0; j<x; j++){
                System.out.println(sb);
            }
            
        }

	}
}