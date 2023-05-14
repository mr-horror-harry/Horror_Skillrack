import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte x = sc.nextByte();
        
        List<Integer>li = new LinkedList<>();
        byte ct;
        while(x-->0){
            char c=sc.next().charAt(0);
            int n=sc.nextInt();
            
            switch(c){
                case '+':
                    li.add(n);
                    break;
                case '-':
                    for(byte i=0; i<li.size(); i++){
                        if(li.get(i)==n){
                            li.remove(i);
                            break;
                        }
                    }
                    break;
                case '?':
                    ct=0;
                    switch(n){
                        case 1:
                            for(byte i=0; i<li.size(); i++){
                                if(li.get(i)%2==1){
                                    ct++;
                                    System.out.print(li.get(i)+" ");
                                }
                            }
                            break;
                        case 0:
                            for(byte i=0; i<li.size(); i++){
                                if(li.get(i)%2==0){
                                    ct++;
                                    System.out.print(li.get(i)+" ");
                                }
                            }
                            break;
                    }
                    System.out.println(ct==0 ? -1 : "");
                    break;
            }
        }
	}
}