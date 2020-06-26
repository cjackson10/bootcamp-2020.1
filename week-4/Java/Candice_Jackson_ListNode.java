package Week4Assignment;
class ListNode {
	int value;
	static ListNode next;
	
	ListNode(int value){
		this.value=value;
	}
}
	
public static class AddTwoNumbers {
	private ListNode addTwoNumbers(ListNode 1,  ListNode 2 ) {
		ListNode result = null, head = null;
		int carry = 0;
		
		while(1 != null || 12 !=null) {
			int sum = 0;
			if(1 !=  null) {
				sum +=1.value;
				1=1.next;
			}
			
			if(2 !=  null) {
				sum +=2.value;
				2=2.next;
		}
			sum+=carry;
			
			int value= sum %10;
			carry= sum/10;
			ListNode node = new ListNode(value);
			
			if(result != null) {
				result.next = node;
				result = result.next;
			}
			
			else {
				result = head = node;
			}
	}
		if (carry > 0) {
			result.next = new ListNode(carry);
		}
		return head;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode 1 =new ListNode (5);
		ListNode 1.next = new ListNode (6);
		ListNode 1.next.next = new ListNode (3);
		
		ListNode 2= new ListNode (8)
		2.next = new ListNode (4);
		2.next.next = new ListNode (2);
		
		ListNode result = addTwoNumbers (1,2);
		while(result != null) {
			System.out.print(result.value + " ");
			result = result.next;
		}
		System.out.println();
	}

}
