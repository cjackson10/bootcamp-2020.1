package Week6Assignments;

public class treePaths {

		    int data; 
		    treePaths left;
			treePaths right; 
		   
		    treePaths(int item)  
		    { 
		        data = item; 
		        left = right = null; 
		    } 
		} 
		   
		class BinaryTree  
		{ 
		    treePaths root; 
		    
		    void printPaths(treePaths node)  
		    { 
		        int path[] = new int[1000]; 
		        printPathsRecur(node, path, 0); 
		    } 
		   
		    
		    void printPathsRecur(treePaths node, int path[], int pathLen)  
		    { 
		        if (node == null) 
		            return; 
		   
		  
		        path[pathLen] = node.data; 
		        pathLen++; 
		   
		    
		        if (node.left == null && node.right == null) 
		            printArray(path, pathLen); 
		        else 
		        { 
		           
		            printPathsRecur(node.left, path, pathLen); 
		            printPathsRecur(node.right, path, pathLen); 
		        } 
		    } 
		   
		   
		    void printArray(int ints[], int len)  
		    { 
		        int i; 
		        for (i = 0; i < len; i++)  
		        { 
		            System.out.print(ints[i] + " "); 
		        } 
		        System.out.println(""); 
		    } 
		   
		     
		    public static void main(String args[])  
		    { 
		        BinaryTree tree = new BinaryTree(); 
		        tree.root = new treePaths(10); 
		        tree.root.left = new treePaths(8); 
		        tree.root.right = new treePaths(2); 
		        tree.root.left.left = new treePaths(3); 
		        tree.root.left.right = new treePaths(5); 
		        tree.root.right.left = new treePaths(2); 
	}

}
