import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt(), x, res=0;
		List <Integer> li = new LinkedList <> ();
		
		while(n-->0){
			x = sc.nextInt();
			if(!li.contains(x))
				li.add(x);
			else 
				li.remove(li.indexOf(x));
		}
		
		Collections.sort(li);
		
		for(int i=0; i<li.size(); i+=2)
			res += li.get(i+1) - li.get(i);
			
		System.out.print(res);
		
	}
}
