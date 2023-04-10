import java.util.Scanner;

class Hello {
	public static void main(String args[]){
      	int n = new Scanner(System.in).nextInt();

      	StringBuilder sb = new StringBuilder("");

      	while (n > 0) {
       		sb.append(n % 8);
			n /= 8;
		}
		System.out.print(sb.equals(sb.reverse()) ? "YES" : "NO");
	}
}
