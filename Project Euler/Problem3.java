package easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Problem3 {

	public static void main(String[] args) {
		
		Set<Integer> primefactors=new HashSet<>();
		//int pf[] = null;
		long copyOfInput=600851475143L;
		for(int i=2;i<=copyOfInput;i++){
			if(copyOfInput %i==0){
				//pf[i-2]=i;
				primefactors.add(i);
				copyOfInput /=i;
				i--;
				
			}
		}
		/*for(int j=0;j<pf.length;j++)
		System.out.println(pf[j]);
		
		//Iterator itr=primefactors.iterator();
		//int a=primefactors.size();
*/		
		System.out.println(primefactors);
	}

}
