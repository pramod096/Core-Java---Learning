
public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 99 , -10, 100123, 18, -978,
					  5623, 463, -9, 287, 49 };
		int a,b,t;
		
		int size = 10;
		int x[][][] = new int[3][][];
		x[0] = new int[20][];
		x[0][0] = new int[10];
		x[0][1] = new int[10];
		x[0][1][9] = 20;
		
		System.out.println(x[0][0][9]);
		
		System.out.print("Originl array is : ");
		for(int i = 0; i < size; i++)
			System.out.print(" " +nums[i]);
		System.out.println();
		
		for(a = 1 ; a < size ; a++)
			for(b = size-1 ; b >=a ; b--) {
				if(nums[b-1] > nums[b]) {
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
				System.out.println("Intermediate array is :");
				for(int i =0 ; i < size ; i++)
					System.out.print(" " + nums[i]);
				System.out.println();
			}
		System.out.print("Sorted arary is:");
		for(int i =0 ; i < size ; i++)
			System.out.print(" " + nums[i]);
		System.out.println();
		}

	}


