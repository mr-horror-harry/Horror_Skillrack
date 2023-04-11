import java.util.*;

public class Main
{
	public static void main(String[] args) {
	     Scanner sc =new Scanner(System.in);
	     char x=sc.next().charAt(0);
	     byte n=sc.nextByte();
	     
	     StringBuilder sb = new StringBuilder("");
	     while(n-->0 && x<='z'){
	         sb.insert(0, x++);
	     }
	     System.out.print(sb);
	     
	}
}
