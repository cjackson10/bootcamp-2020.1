package Week2Assignment;
import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
    	
    	System.out.println("Enter string");
    	String string = keyboard.nextLine();
    	 
        int n = string.length(); 
        Permutation permutation = new Permutation(); 
        permutation.permutate(string, 0, n-1); 
    } 
  
    private void permutate(String string, int left, int right) 
    { 
        if (left == right) 
            System.out.println(string); 
        else
        { 
            for (int i = left; i <= right; i++) 
            { 
                string = swap(string,left,i); 
                permutate(string, left+1, right); 
                string = swap(string,left,i); 
            } 
        } 
    } 
  
  
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    
	}

}
