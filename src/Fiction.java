public class Fiction implements Book
{
    boolean isFiction = true;
    int bookId = 302, numOfCopies = 4;
    String name = "Book", author = "Victor";

    public Fiction()
    {
         bookId = 546;
        numOfCopies = 4;
        name = "Book" ;
        author = "Victor";
    }



    public Fiction(String name, int numOfCopies, int bookId, String author, boolean isFiction)
    {
        this.name = name;
       this.numOfCopies = numOfCopies;
        this.bookId = bookId;
        this.author = author;



    }//end of 5 constructor

    public int getNumOfCopies()
    {
        return numOfCopies;
    }

    public String getName()
    {
        return name;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setNumOfCopies(int numOfCopies)
    {
        this.numOfCopies = numOfCopies;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void getBook(int damage)
    {

    }

    @Override
    public String toString()
    {
        return "Fiction{" +
                "isFiction=" + isFiction +
                ", bookId=" + bookId +
                ", numOfCopies=" + numOfCopies +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}


