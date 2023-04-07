import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		String s = new Scanner(System.in).next();
		
		for(int i=0; i<s.length(); i+=2){
			if(i==0){
				if(s.charAt(1)!='0') System.out.print(s.charAt(1));
				System.out.print(s.charAt(0));
			}
			else{
				System.out.print(s.charAt(i+1) +""+ s.charAt(i));
			}
		}
		
	}
}
