import java.util.*;
public class Hello {

    public static void main(String[] args) {
        char ar[] = new Scanner(System.in).next().toCharArray();
        
        for(int i=0, j=ar.length-1; j>=0; i++, j--){
            if(ar[j]=='0') System.out.println("-");
            else System.out.println( Character.toString(ar[i]).repeat(ar[j]-'0'));
        }
	}
}