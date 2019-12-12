import java.util.*;
public class Scan {
	private static int[] strings;// array for strings
	private static int beginpos;// Beginning position of head
	private static int summation;// calculates essentially the amount of movements
	private int rangeofdisks = 4999;
	
public static  void scancode (int[]s, int sum, int begin,int before) {
	strings= new int[s.length];// we're counting the length of the array
	System.arraycopy(s,0,strings,0,s.length);// copying the array from the starting  position to said length
	beginpos = sum;
	summation=0;
}

public int Request() {
	ArrayList<Integer> reqlist = new ArrayList<Integer>(); // we create a list of arrays
	for(int i=0; i<this.strings.length;i++) { // if i is less than the length of the array
		reqlist.add(this.strings[i]); // we therefore add the integer to the array at index i
	}
	int direct=1;
	int current = this.beginpos;
	int summation=0;
	while(!reqlist.isEmpty()) { // if the request list isn't empty we turn the current location and 
								//the direction equal
								// to one another
		current += direct;// direction and the current int are equal, we add them to one another
		summation++; // we increment to see if it is the same at the next turn
		if(reqlist.contains((current))) { // if the request list contains the current int at that location
										// it'll then remove said int and move on to the following int
			reqlist.remove((current));
		}
		if(current == this.rangeofdisks) {  // if the current int is equal to the range then we add
											// summation to the range
			summation+= this.rangeofdisks;
			current =-1; // current becomes null

		}
		else {
			summation++;
		}
		return summation;
	}
	return current;
}


	public static void main(String[] args) {

		int [] s= {1000,2999,3456,1290,99};
		scancode (s, 99,1250,5000);
		System.out.println("The total number of movements are: "+ summation);
	}
}
