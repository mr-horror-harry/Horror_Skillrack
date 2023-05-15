import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        String[] ar=new Scanner(System.in).nextLine().split(" ");
        int n=ar.length;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                
                int f=0;
                for(char c:ar[i].toCharArray()){
                    if(ar[j].indexOf(c+"")==-1){
                        f=1;
                        break;
                    }
                }
                for(char c:ar[j].toCharArray()){
                    if(ar[i].indexOf(c)==-1){
                        f=1;
                        break;
                    }
                }
                
                if(f==0){
                    if(ar[i].length() <= ar[j].length()){
                        ar[j]=ar[i];
                    }else{
                        ar[i]=ar[j];
                    }
                }
            }
        }
        
        for(String s:ar) System.out.print(s+" ");

	}
}