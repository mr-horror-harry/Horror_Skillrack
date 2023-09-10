import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        char ar[] = new Scanner(System.in).next().toCharArray();
        int i;
        
        for(i=0; i<ar.length; i++)
            ar[i] = ar[i]=='a' || ar[i]=='e' || ar[i]=='i' || ar[i]=='o' || ar[i]=='u' || ar[i]=='A' || ar[i]=='E' || ar[i]=='I' || ar[i] =='O' || ar[i]=='U' ?
            
                '1' : '0';
        
        int ct=0, max=0;
        boolean f=false;
        
        for(char c:ar){
            if(c=='1' && !f)
                f=true;
                
            if(c=='1' && f){
                if(ct>max)
                    max=ct;
                ct=0;
            }
            else if(c=='0' && f)
                ct++;
        }
        System.out.print(max);
	}
}