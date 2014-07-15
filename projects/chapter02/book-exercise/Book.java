/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    // Add the methods here ...
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public void printAuthor()
    {
        System.out.println(getAuthor());
    }
    
    public void printTitle()
    {
        System.out.println(getTitle());
    }
    
    public void printDetails()
    {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("No. of Pages: " + getPages());
        if(refNumber.length() > 0)
        {
            System.out.println("Ref No: " + getRefNumber());
        }
        else
        {
            System.out.println("Ref No: ZZZ");
        }
        System.out.println("Borrowed " + getBorrowed() + " times.");
        System.out.println();
    }
    
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("Error: The Ref Number must be more than three characters long");
        }
    }
    
    public void borrow()
    {
        borrowed += 1;
    }
}
