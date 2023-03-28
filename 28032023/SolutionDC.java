import java.util.Scanner;

class Main
{
	public static void main(String[] args) {
	    int n = new Scanner(System.in).nextInt();
	    Func func = new Func();
	    
	    for(int i=2; i<=n/2; i++){
	        if(func.isPrime(i) && func.isPrime(n-i)){
	            System.out.print(i +" "+ (n-i));
	            return;
	        }
	    }
	    System.out.print(-1);
	    return;
	}
}

class Func{
    boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        
        return true;
    }
}