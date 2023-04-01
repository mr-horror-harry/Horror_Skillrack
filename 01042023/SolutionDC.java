//Implementation using arraylist

import java.util.*;

class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt(), n=sc.nextInt();

		ArrayList< ArrayList<Integer> > mat = new ArrayList< ArrayList<Integer> >();

		for(int i=0; i<m; i++){
			ArrayList<Integer> inArr = new ArrayList<Integer>();

				inArr.add(sc.nextInt());
			}
			mat.add(inArr);
		}

		for(int i=0; i<m-1; i++){
			for(int j=0; j<n-1; j++){
				System.out.print(mat.get(i+1).get(j) + mat.get(i).get(j+1) +" ");
			}
			System.out.println(mat.get(i+1).get(n-1));
		}

		for(int j=0; j<n-1; j++) System.out.print(mat.get(m-1).get(j+1) + " ");
		System.out.print(mat.get(m-1).get(n-1));

	}
}