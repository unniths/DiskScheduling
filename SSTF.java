import java.util.Arrays;

public class SSTF {
	
	static int[] arr;
	static int closest = -1;

//	public static void sortArray(int[] array) {
//		
//		int temp;
//		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = i; j > 0; j--) {
//				if(array[j] < array[j - 1]) {
//					temp = array[j];
//					array[j] = array[j - 1];
//					array[j - 1] = temp;
//				}
//			}
//		}
//
//		System.out.println(Arrays.toString(array));
//		
//	}
	
	//Find shortest distance from head
	public static int findShortestDistance(int head) {
		
		int minimum = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			int distance = Math.abs(head - arr[i]);
			if(distance < minimum) {
				minimum = distance;
				closest = arr[i];
			}
		}
		
		return closest;
		
	}
	
	public static void getSSTF(int[] array, int headd) {
		
//		int n = array.length;
//		int[] sstf = new int[n + 1];
//		sstf[0] = headd;
//		
//		for(int i = 0; i < n - 1; i++) {
//			
//			sstf[i + 1] = findShortestDistance(headd);
//			System.out.println(sstf[i + 1]);
//			headd = closest;
//			
//		}
		
		
//		int n = array.length;
//		int sstf[] = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			
//			sstf[i] = array[i];
//			
//		}
		
		//create array
		int n = array.length;
		int sstf[] = new int[n + 1];
		sstf[0] = headd;
		
		for(int i = 0; i < n; i++) {
			
			findShortestDistance(headd);
			System.out.println(sstf[i]);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int array[] = {98, 183, 37, 122, 14, 124, 65, 67};
//		sortArray(array);
		
		getSSTF(array, 50);
		
	}
	
}
