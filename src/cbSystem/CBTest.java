

package cbSystem;

public class CBTest {

    public static void main(String[] args) throws Exception {
        SortedADT sorted = new BinarySearchTree();
        sorted.insert("bombsHell");
        sorted.insert("kingsmen");
        sorted.insert("jojo Rabit");
        sorted.insert("x-alibre");
        sorted.insert("pineapple express");
        sorted.insert("xmen");
        sorted.insert("1917");
        sorted.insert("hustlers");
        sorted.insert("dumbo");
        sorted.insert("james bond");
        // Test Inserts
        
       // System.out.println(sorted);// This prints the populated tree
        String movieTitle;
        Integer option;
        String exit;
        do{
        	System.out.println("Please Selct one of thse options.");
        	System.out.println("1 :Movie Catelogue");
        	System.out.println("2 :Search for movie");
        	System.out.println("0 :Exit");
        	option = Input.getInteger("option: ");
        	switch(option) {

        	case 1:
        		System.out.println("You have chosen the first option");
        		break;
        	case 2:
		        	do {
		        		movieTitle = Input.getString("Movie Title: ").toLowerCase();
		                try {
		                    sorted.find(movieTitle);
		                    System.out.println("Movie Found");
		                } catch (SortedADT.NotFoundException e) {
		                    System.out.println("Movie not found: " + movieTitle);
		                }
		            }while(Repeat.repeat());//End of do/while loop 
            break;
            
        	case 0:
        		System.out.print("Are you sure you want to exit? ");
        		//System.out.println();
        		do {
        			exit = Input.getString("Y/N: ").toLowerCase();
            		if(exit == "Y" ||exit == "y") {
            			System.exit(0);
            			System.out.println("Goodbye");
            			
            		}else if(exit == "N" ||exit == "n") {
            			System.out.println("Returning to main menu");
            			break;
            		}
        		}while(exit == "n" || exit == "y");
        		
            break;
        
        	default:
        		
        		System.out.println("this didnt wurk");
        		
        		break;
        	
        	}
        	
        	  
           
            
        }while(option !=0);// End of main do while loop //
    }// End of Main
}// End of CBTest
