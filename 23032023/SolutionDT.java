import java.util.*;

class Hello{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		short n = sc.nextShort();
		byte u = sc.nextByte();
		byte f=0;

		int pre=0;

		while(n-->0){
			int x=sc.nextInt();
			if((byte)(x%10)==u){
				if(x>=pre){
					pre=x;
				}
				else{
					f=1;
					break;
				}
			}
		}
		System.out.print(f==0 ? "yes" : "no");		
	}
}