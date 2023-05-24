import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        int n=new Scanner(System.in).nextInt();
        
        StringBuilder sb = new StringBuilder("");
        while(n>0){
            sb.insert(0, n%2);
            n/=2;
        }
        
        String ar[] = sb.toString().split("");
        
        int v1=1,v2=1;
        for(int i=0, j=sb.length()-1; j>=0; i++, j--){
            if(ar[i].equals("1")) ar[i]=(v1++)+"-";
            if(ar[j].equals("0")) ar[j]=(v2++)+"-";
        }
        
        for(String s:ar){
            System.out.print(s.substring(0, s.length()-1));
        }
	}
}