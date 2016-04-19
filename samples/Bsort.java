package Basic1;

public class Bsort {

		public  void bubbleSort(int[] sarray){
			int len;
			
			len=sarray.length;
			for (int i=0;i<len;i++){
				for(int j=1;j<(len-i);j++){
					if(sarray[j-1]>sarray[j]){
						int temp=sarray[j-1];
						sarray[j-1]=sarray[j];
						sarray[j]=temp;
					}
				}
			}
			for(int i=0;i<len;i++){
				System.out.println(sarray[i]);
			}
		}
	

}
