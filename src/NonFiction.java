public class NonFiction implements Book
{
    boolean nonFiction = true;

    int bookId = 302, numOfCopies = 4;
    String name = "Book", author = "Victor";

    public NonFiction()
    {
        bookId = 546;
        numOfCopies = 4;
        name = "Book1" ;
        author = "Victor D";
    }

    public int getNumOfCopies()
    {
        return numOfCopies;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getName()
    {
        return name;
    }

    public void setNumOfCopies(int numOfCopies)
    {
        this.numOfCopies = numOfCopies;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public NonFiction(String name, int numOfCopies, int bookId, String author, boolean NonFiction)
    {
        this.name = name;
        this.numOfCopies = numOfCopies;
        this.bookId = bookId;
        this.author = author;



    }//end of 5 constructor

    public void getBook(int damage)
    {

    }

    @Override
    public String toString()
    {
        return "NonFiction{" +
                "nonFiction=" + nonFiction +
                ", bookId=" + bookId +
                ", numOfCopies=" + numOfCopies +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}




