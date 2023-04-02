import java.util.Scanner;

class Main{
	public static void main(String args[]){

		char[] ar = new Scanner(System.in).next().toCharArray();
		for(int i=0; i<ar.length; i++){

			int flag=0;
			for(int j=0; j<ar.length; j++){
				if(i!=j){
					if(ar[i]==ar[j]){
						flag=1;
						break;
					}
				}
			}
			if(flag==0){
				System.out.print(i);
				return;
			}
		}
		System.out.print(-1);
		return;

	}	
}