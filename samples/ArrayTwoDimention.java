package samples;
/* The output will be like this
 * 0
 * 1 2
 * 3 4 5
 * 6 7 8 9
 */
public class ArrayTwoDimention {

	public static void main(String[] args) {
	int twod[][]=new int[4][];//second array size is given below to change different size
	twod[0]=new int[1];// here in 0th row - one column should be there
	twod[1]=new int[2];// here in 1st row- two column should be there and so on....
	twod[2]=new int[3];
	twod[3]=new int[4];
	int i,j,k=0;
	for (i=0;i<4;i++)
		for(j=0;j<i+1;j++)
		{
			twod[i][j]=k;
			k++;
		}
	for (i=0;i<4;i++){
		for(j=0;j<i+1;j++)
		{
			System.out.print(twod[i][j]+" ");
		}
			System.out.println();
		}
	
	
	for (i=0;i<10;i++){
		for(j=i;j<10;j++)
			System.out.print(".");
		System.out.println();
	}
	//System.out.println();
	
	
	
	
	}
	

}
