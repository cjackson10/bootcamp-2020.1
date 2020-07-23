package Week8Assignment;
import java.lang.reflect.Array;
import java.util.Arrays;
public class problem1 {

	public static void main(String[] args, int k) {
		// TODO Auto-generated method stub
		int [] testArray = new int [] {2,2,1,3,1};
		System.out.println(smallestNumberRepeatedKTimes(testArray, k=2));
	}
	
	public static int smallestNumberRepeatedKTimes(int [] array, int k) {
		Arrays.sort(array);
		int count = 0;
		int currentInt = 0;
		for(int i=0; i< array.length; i++) {
			if (currentInt != array[i] && count ==k) {
				break;
			}
			
			else if(count != k && currentInt != array[i]) {
				count = 1;
				currentInt = array[i];
			}
			
			else {
				count++;
			}
		}
		return currentInt;
	}

	
}
