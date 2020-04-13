

package cbSystem;

public class CBTest {

    public static void main(String[] args) throws Exception {
        SortedADT sorted = new BinarySearchTree();
        sorted.insert("bombsell");
        sorted.insert("kingsmen");
        sorted.insert("jojo Rabit");
        sorted.insert("X-Calibre");
        sorted.insert("Pineapple Express");
        sorted.insert("xmen");
        sorted.insert("b");
        sorted.insert("c");
        sorted.insert("d");
        sorted.insert("e");
        // Test Inserts
        
        System.out.println(sorted);// This prints the populated tree
        String value;
        Integer option;
        do{
        	option = Input.getInteger("option: ");
        	switch(option) {
        	
        	case 1:
        		System.out.println("You have chose the first option");
        		break;
        	case 2:
		        	do {
		        		value = Input.getString("value: ");
		                try {
		                    sorted.find(value);
		                    System.out.println("found");
		                } catch (SortedADT.NotFoundException e) {
		                    System.out.println("value not found");
		                }
		            }while(Repeat.repeat());//End of do/while loop 
            break;
        		
        	default:
        		System.out.println("this didnt wurk");
        		break;
        	
        	}
        	
        	  
           
            
        }while(option !=0);// End of main do while loop //
    }// End of Main
}// End of CBTest
