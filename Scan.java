import java.util.*;
public class Scan {
	private static int[] strings;
	private static int beginpos;
	private static int summation;
	private int rangeofdisks = 4999;
	
public Scan(int[]s, int sum) {
	this.strings= new int[s.length];
	System.arraycopy(s,0,strings,0,s.length);
	this.beginpos = sum;
	this.summation=0;
}

public int Request() {
	ArrayList<Integer> reqlist = new ArrayList<Integer>();
	for(int i=0; i<this.strings.length;i++) {
		reqlist.add(this.strings[i]);
	}
	int direct=1;
	int current = this.beginpos;
	int summation=0;
	while(!reqlist.isEmpty()) {
		current += direct;
		summation++;
		if(reqlist.contains((current))) {
			reqlist.remove((current));
		}
		if(current == this.rangeofdisks) {
			summation+= this.rangeofdisks;
			current =-1;
			//System.out.println(ref2string);
		}
		else {
			summation++;
		}
		return summation;
	}
	return current;
}


	public static void main(String[] args) {
		
		int [] ref2string= {1000,2999,3456,1290,99};
		System.out.println("The total number of movements are: "+ summation);
	}
}
