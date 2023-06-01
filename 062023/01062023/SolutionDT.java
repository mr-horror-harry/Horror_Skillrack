import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();
        
        int ar[] = new int[n];
        for(int i=0; i<n; i++) ar[i]=sc.nextInt();
        
        int ct=n/k, f=0;
        int x, i=0, j=ar.length, tmp, iCt;
        while(ct>0){
            x=k;
            if(f==0){
                f=1;
                while(x-->0){
                    System.out.print(ar[i++]+" ");
                }
                
            }
            else if(f==1){
                f=0;
                iCt=x;
                while(x-->0){
                    j--;
                }
                
                tmp=j;
                while(iCt-->0){
                    System.out.print(ar[tmp++]+" ");
                }
                
            }
            ct--;
        }

	}
}