import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List <String> li = new  ArrayList <String> (Arrays.asList(sc.nextLine().split(" ")));

		for(int i=n; i>=0; i--) System.out.print(li.get(i)+" ");
		for(int i=n; i<li.size(); i++) System.out.print(li.get(i)+" ");

	}
}