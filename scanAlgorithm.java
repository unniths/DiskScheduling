import java.util.Arrays;
public class scanAlgorithm {
	
   public static void scan(int[] arr, int head, int prev, int cylinders) {
		Arrays.sort(arr);
		int diff = 0;
		if(head < prev) {
			for (int i = indexOf(arr, head); i >= 0; i--) {
				if (i == 0) {
					diff += arr[0];
				} else {
					diff += (arr[i] - arr[i-1]);					
				}
			}
			
			int j = indexOf(arr, head) + 1;
			diff += arr[j];
			
			for(int k = j; k < arr.length; k++) {
				if(k == arr.length -1) {
				} else {
					diff += (arr[k+1] - arr[k]);					
				}
			}
			
		} 
		
		if(head > prev) {
			for (int i = indexOf(arr, head); i < arr.length; i++) {
				if(i == arr.length -1) {
					diff += ((cylinders - 1) - arr[i]);
				}else {
					diff += (arr[i+1] - arr[i]);										
				}
			}
			
			int j = indexOf(arr, head) - 1;
			diff += ((cylinders - 1) - arr[j]);
			
			for(int k = j; k > 0; k--) {
				diff += (arr[k] - arr[k-1]);					
				}
			
		}
		
		System.out.print(diff + " " + "cylinders");
	}
	
	public static int indexOf(int[] arr, int value) { //Function to find the index of head in the array
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == value) {
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*  Your program will service a disk with 5000 cylinders numbered 0 to 4999. The 
		program will generate a random series of 1,000 cylinder requests and service them 
		according to each of nth algorithms listed above. The program will be passed the
		initial position of the disk head and report the total amount of head movement 
		required by the algorithm. 
		
		*example that we've done in class*
		Head: 2150, Previous: 1805 
		(2069, 1212, 2296, 2800, 544, 1618, 356, 1523, 3681, 2150)
		
		*/
		
		
		int[] arr = {2069, 1212, 2296, 2800, 544, 1618, 356, 1523, 3681, 2150};
		scan(arr, 2150, 1805, 5000);
	}

}