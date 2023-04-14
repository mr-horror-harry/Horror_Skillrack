import java.util.Scanner;

class Main{
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder(new Scanner(System.in).next());
		int l=sb.length();

		for(int i=l-1 ; i>=0; i--){
			if(l%(i+1)!=0){
				sb.deleteCharAt(i);
			}
		}

		System.out.print(sb);
		return;
	}
}
