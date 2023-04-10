import java.util.Scanner;

class Main{
	public static void main(String args[]){
		byte n = new Scanner(System.in).nextByte();
		byte s=1;
		
		while(n-->0)
		    System.out.println("-".repeat(n) + "*".repeat(s) +"*".repeat(s++) + "-".repeat(n));
		    //since byte can't exceed 128byte "*" repeat ==> 2 times
	}
}