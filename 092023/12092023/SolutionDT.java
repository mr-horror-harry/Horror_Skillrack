import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();
        int blue=n*2, orange=n*5, tmp, sheet=0;
        
        for(tmp=0; tmp<blue; tmp+=k, sheet++);
        for(tmp=0; tmp<orange; tmp+=k, sheet++);
        
        System.out.print(sheet);
	}
}