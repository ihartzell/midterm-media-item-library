import java.util.Scanner;
public class Library 		
{
	private MediaItem[] items = new MediaItem [100];	// Array to hold all of the items in the library. 100 at least.
	private String[] stringArray = new String[100]; 	// Array to hold an array of string objects, at least 100.
	private int numberOfItems = 0;
	
	public int displayMenu()							// Menu Method.
	{
		int menuChoice;									// 1, 2,3 ect...
		Scanner input = new Scanner(System.in);
	
		System.out.println("1. Add new item");
		System.out.println("2. Mark an item as on loan");
		System.out.println("3. List all items");
		System.out.println("4. Mark an item as returned");
		System.out.println("5. Quit");
		System.out.print("\n" + "What would you like to do?");
		menuChoice = input.nextInt();
		
		while (menuChoice < 1 || menuChoice > 5)	// Validation for menuChoice being negative or above range.
		{
			System.out.println("I'm sorry," + menuChoice + " wasn't one of the options." + "\n");
			System.out.println("1. Add new item");
			System.out.println("2. Mark an item as on loan");
			System.out.println("3. List all items");
			System.out.println("4. Mark an item as returned");
			System.out.println("5. Quit");
			System.out.print("\n" + "What would you like to do?");
			menuChoice = input.nextInt();
		}
		
		return menuChoice;	
	}
	
	public void addNewItem(String title, String format)		// Creates the new MediaItem object and adds it to the items array.
	{
		MediaItem itemObj = new MediaItem(title,format);
		items [numberOfItems] = itemObj;
		numberOfItems++;
	}
	
	public void markItemOnLoan(String title, String name, String date)	// Iterates through the items array and 
	{																	// and finds them with the correct title.
		boolean itemFound = false;
		
		for(int index = 0; index < numberOfItems;index++)
		{
			if(title.equalsIgnoreCase(items[index].getTitle()))
			{																	
				itemFound = true;
				if (!items[index].isOnLoan())
				{
					items[index].markOnLoan(name,date);
				}
				else
				{
					System.out.println(title + " is already on loan to " + items[index].getLoanedTo());
				}
			}
		}
		if (!itemFound)
		{
			System.out.println("I'm sorry, I couldn't find " + title + " in the library.");
		}
	}
	
	public String[] listAllItems()
	{
		for (int index = 0; index < numberOfItems; index++)
		{
			if (items[index].isOnLoan())
			{
				stringArray[index] = "\n" + items[index].getTitle() + " " + ("(") + items[index].getFormat() + (")") +
				" loaned to " + items[index].getLoanedTo() + " on " + items[index].getDateLoaned();
				System.out.println(stringArray[index] );
			}
			else
			{
				stringArray[index] = "\n" + items[index].getTitle() + " " + ("(") + items[index].getFormat() + (")");
				System.out.println(stringArray[index] );
			}	
		}
		return stringArray;
	}
	
	public void markItemReturned(String title)
	{
		boolean itemFound = false;
		
		for(int index = 0; index < numberOfItems; index++)
		{
			if(title.equalsIgnoreCase(items[index].getTitle()))
			{
				items[index].markReturned();
				itemFound = true;
			}	
		}
		if (!itemFound)
		{
			System.out.println("Sorry, I couldn't find " + title + " in the library. ");
			
		}
	}
		
}

