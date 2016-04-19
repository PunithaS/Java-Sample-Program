package Basic1;

/* class bsort{
public  int[] bubbleSort(int[] sarray){
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
	return sarray;
}
}*/
public class BubbleSort {
	public  int[] bubbleSort(int[] sarray){
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
		return sarray;
	}

	public static void main(String[] args) {
		//Bsort bs=new Bsort();
		int array[]={12,5,62,2,45,32};

		BubbleSort bs=new BubbleSort();
		int[] finalarray=bs.bubbleSort(array);
		System.out.println("Bubble sort");
		for(int i=1;i<finalarray.length;i++){
			System.out.println(finalarray[i]);
		}
		
	}

}
