package Week4Assignment;

public class Reverse {
	
	public Reverse(char data, Reverse next) 
    { 
        Data = data; 
        Next = next; 
    } 
    public char Data; 
    public Reverse Next; 
} 
class LinkList { 
  
    
    private static Reverse CreateLinkedList(String s) 
    { 
    	Reverse header = null; 
    	Reverse temp = null; 
       
        for (int i = 0; i < s.length(); i++) { 
            char c = s.charAt(i); 
            Reverse node = new Reverse(c, null); 
  
            if (header == null) { 
                header = node; 
                temp = header; 
            } 
            else { 
                temp.Next = node; 
                temp = temp.Next; 
            } 
        } 
        return header; 
    } 
  
    
    private static Reverse Reverse(Reverse header) 
    { 
        if (header == null) 
            return header; 
  
        Reverse wordStartPosition = null; 
        Reverse endOfSentence = null; 
        Reverse sentenceStartPosition = null; 
  
        
        wordStartPosition = header; 
  
       
        while (header != null && header.Data != ' ') { 
  
            endOfSentence = header; 
  
            header = header.Next; 
        } 
  
       
        if (header == null) { 
            header = wordStartPosition; 
            return header; 
        } 
  
        do { 
  
        	Reverse temp = header.Next; 
            header.Next = wordStartPosition; 
            wordStartPosition = header; 
            header = temp; 
  
            Reverse prev = null; 
            
            sentenceStartPosition = header; 
  
             
            while (header != null && header.Data != ' ') { 
                prev = header; 
                header = header.Next; 
            } 
  
             
            prev.Next = wordStartPosition; 
  
            
            wordStartPosition = sentenceStartPosition; 
            if (header == null) 
                break; 
  
            
        } 
        
        while (header != null); 
  
        header = sentenceStartPosition; 
   
        endOfSentence.Next = null; 
        return header; 
    } 
  
   
    private static void PrintList(Reverse Header) 
    { 
    	Reverse temp = Header; 
        
        while (temp != null) { 
            System.out.print(temp.Data); 
            temp = temp.Next; 
        } 
    } 
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "code big or go home"; 
		  
        Reverse header = CreateLinkedList(s); 
  
        System.out.println("Before:"); 
        PrintList(header); 
  
        header = Reverse(header); 
  
        System.out.println("\nAfter:"); 
        PrintList(header); 
	}

}
