/* 
Isaac Hartzell  
March 1, 2017 Last modified March 2, 2017
This program demonstrates a Multi Media Library. 
*/

import java.util.Scanner;
public class MidtermProjectCIS2212Driver 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int menuChoice = 0;
		
		Library libraryObject = new Library(); 					// Creates an instance or object of the Library class
		MediaItem mediaItemObject = new MediaItem();			// Creates an instance or object of the MediaItem class
		
		System.out.println("************************************Media Library!************************************");
		System.out.println("*       			  	         			             *");						
		System.out.println("*         			    Instructions:     	 	                     *");	
		System.out.println("* A.Type in whatever type of media you want.                                         *");
		System.out.println("* B.Case sensitive so make sure you retype words the same way.                       *");
		System.out.println("* C.Enjoy!                    			                                     *");
		System.out.println("*                      		                                                     *");
		System.out.println("*                      			 		                             *");
		System.out.println("**************************************************************************************");
		System.out.println("\n");
		
		do
		{			
			menuChoice = libraryObject.displayMenu();
			
			if	(menuChoice == 1)									// Add new item
			{
				System.out.print("What is the title?");
				mediaItemObject.setTitle (input.nextLine());
				System.out.print("What is the format? ");
				mediaItemObject.setFormat(input.nextLine());
				libraryObject.addNewItem(mediaItemObject.getTitle(), mediaItemObject.getFormat());	
				System.out.print("\n");
			}
			else if (menuChoice == 2)								// Mark an item as on loan			
			{
				System.out.print("Which item (enter the title?)");
				mediaItemObject.setTitle(input.nextLine());
				System.out.print("Who are you loaning it to?");
				mediaItemObject.setLoanedTo(input.nextLine());
				System.out.print("When did you loan it to them?");
				mediaItemObject.setDateLoaned(input.nextLine());
				libraryObject.markItemOnLoan(mediaItemObject.getTitle(), mediaItemObject.getLoanedTo(),mediaItemObject.getDateLoaned());
				System.out.print("\n");
			}
			else if (menuChoice == 3)										// List all items.
			{
				libraryObject.listAllItems();
				System.out.print("\n");
			}
			else if (menuChoice == 4)										// Mark an item as returned.
			{
				System.out.print("Which item (enter the title?)");
				mediaItemObject.setTitle(input.nextLine());
				libraryObject.markItemReturned(mediaItemObject.getTitle());
				System.out.print("\n");
			}
			else if (menuChoice == 5)										// Quit.
			{
				System.out.println("Goodbye! thank you for using Isaac's Library.");
				System.out.print("\n");
			}	
		}while(menuChoice >=1 && menuChoice <= 4);
	}	// main brace
}	// Class brace
