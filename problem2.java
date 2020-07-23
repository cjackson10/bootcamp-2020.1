package Week8Assignment;
public class problem2 {

static int binarySearch(int [] arr, int key) {
	int low = 0;
	int high = arr.length -1;
	while(low <= high) {
		int mid = (low+high)/2;
		if(arr[mid]< key) {
			low = mid+1;
		
		}
		else if (arr[mid]> key && arr[mid-1]>=key) {
			high = mid-1;
		}
		else {
			return mid;
		}
		
	}
	return -1;
}
	public static int daysToCollectStones(int [] days, int stones) {
		// TODO Auto-generated method stub
		int [] totalStones = new int [days.length];
		totalStones[0] = days[0];
		
		for(int i=1;i<days.length; i++) {
			totalStones[i] = totalStones[i-1] + days[i];
		}
		return binarySearch(totalStones, stones)+1;
	}

}
