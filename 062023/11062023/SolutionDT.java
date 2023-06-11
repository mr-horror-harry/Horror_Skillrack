import java.util.*;
public class Main {
    static StringBuilder sb;
    static char x;

    public static void main(String[] args) {
        
        int n = new Scanner(System.in).nextInt();
        int ct=0;
        
        while(n>0){
            System.out.print("-".repeat(ct));
            if(ct%2==0){
                ord(n);
            }
            else{
                rev(n);
            }
            System.out.println("-".repeat(ct));
            ct++;
            n--;
        }
	}
	
	static void ord(int n){
	    sb = new StringBuilder("");
	    x='a';
	    while(n-->0) sb.append(x++);
	    System.out.print(sb);
	    System.out.print(sb.reverse());
	    return;
	}
	
	static void rev(int n){
	    sb = new StringBuilder("");
	    x = 'a';
	    while(n-->0) sb.append(x++);
	    System.out.print(sb.reverse());
	    System.out.print(sb.reverse());
	    return;
	}
}