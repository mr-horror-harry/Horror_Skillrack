// Solution using List and Iterator

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n, x;
		
		n = sc.nextInt();

		List <Integer> lst = new LinkedList <Integer> ();
		while(n-->0) lst.add(sc.nextInt());

		x = sc.nextInt();

		Iterator i = lst.iterator();
		while(i.hasNext()){
			if( ( (Integer) i.next() ).intValue() < x){
				System.out.print("no");
				return;
			}
		}
		System.out.print("yes");
		return;
	}
}