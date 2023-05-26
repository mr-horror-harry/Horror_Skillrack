import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String>li = new ArrayList<>();
        
        for(String s:sc.nextLine().split(" ")){
            li.add(s);
        }
        
        for(String s:sc.nextLine().split(" ")){
            
            if(li.contains(s)){
                while(li.contains(s)){
                    li.remove(s);
                } 
            }
            if(li.size()==0){
                System.out.print(-1);
                return;
            }
        }
        for(String s:li) System.out.print(s+" ");
	}
}