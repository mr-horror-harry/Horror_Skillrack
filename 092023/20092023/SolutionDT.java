import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char a1[] = sc.nextLine().toCharArray();
        char a2[] = sc.nextLine().toCharArray();
        
        int min, max, i;
        boolean f=false;
        
        if(a1.length < a2.length){
            min=a1.length;
            max=a2.length;
        }
        else{
            min=a2.length;
            max=a1.length;
            f=true;
        }
        
        for(i=0; i<min; i++){
            if(a2[i]==' '){
                if(a1[i]!=' '){
                    a2[i]=a1[i];
                    a1[i]='-';
                }
                else{
                    a2[i]='-';
                    a1[i]='-';
                }
            }
            System.out.print(a1[i]==' ' ? '-' : a1[i]);
        }
        
        System.out.print("-".repeat(max-min));
        
        System.out.println();
        
        System.out.print(String.join("-", new String(a2).split(" ")));
        
        if(f)
            for(i=min; i<max; i++)
                System.out.print(a1[i]!=' ' ? a1[i] : '-');
	}
}