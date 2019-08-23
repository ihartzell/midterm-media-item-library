
public class MediaItem 
{
	private String title;
	private String format;
	private boolean onLoan;
	private String loanedTo;
	private String dateLoaned;
	
	MediaItem()	// Constructor to initialize the fields of this media item to default values.
	{
		title = null;
		format = null;
		loanedTo = null;
		dateLoaned = null;
		onLoan = false;
	}
	
	MediaItem(String title, String format)	// Constructor to initialize the title and format of this media item.
	{
		onLoan = false;
		this.title = title;
		this.format = format;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getFormat() 
	{
		return format;
	}

	public void setFormat(String format) 
	{
		this.format = format;
	}

	public boolean isOnLoan() 
	{
		return onLoan;
	}

	public void setOnLoan(boolean onLoan) 
	{
		this.onLoan = onLoan;
	}

	public String getLoanedTo() 
	{
		return loanedTo;
	}

	public void setLoanedTo(String loanedTo) 
	{
		this.loanedTo = loanedTo;
	}

	public String getDateLoaned() 
	{
		return dateLoaned;
	}

	public void setDateLoaned(String dateLoaned) 
	{
		this.dateLoaned = dateLoaned;
	}
	
	public void markOnLoan(String name, String date)	// Sets onLoan to true and sets the loanedTo and dateLoaned fields to 
	{													// parameter values.
		if (onLoan == true)								// If onLoan is already true...
		{
			System.out.println(this.title + " is already loaned out.");
		}
		else
		{
			onLoan = true;
			loanedTo = name;
			dateLoaned = date;
		}
	}
	
	public void markReturned()	//Sets onLoan to false. I
	{
		if (onLoan == false)	// If onLoan is already false...
		{
			System.out.println(this.title + ": This item isn't currently loaned out.");
		}
		onLoan = false;
	}
	
	
	
	
	
}
