import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1[] = sc.nextLine().split(" ");
        String a2[] = sc.nextLine().split(" ");
        
        boolean f;
        
        for(String s : a2){
            f=false;
            for(int i=0; i<a1.length; i++){
                if(s.equals(a1[i])){
                    f=true;
                    a1[i]="";
                    break;
                }
            }
            
            if(!f){
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
	}
}