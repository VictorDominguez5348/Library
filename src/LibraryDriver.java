public class LibraryDriver
{

    public static void main(String[] args)
{

    Fiction FictionBook1 = new Fiction("Book1", 5, 134, "Author 1", true);
   Student student1 = new Student("Victor", 12,345);
   Staff staff1= new Staff("Worf", 345 );
    NonFiction NonFiction1 = new NonFiction("Book2", 3, 143,"Victor", true );


Books = {Book1, Book2};
        for (Books e: cast)
            System.out.println(e);
        
    System.out.println();


    System.out.println(NonFiction1);
    NonFiction1.setName("New Book");
    System.out.println(NonFiction1);

    System.out.println();

    System.out.println(student1);
    System.out.println();

    System.out.println(staff1);
    System.out.println();
//hello
    System.out.println(FictionBook1);
    FictionBook1.setAuthor("Me");
    System.out.println(FictionBook1);



}//end of main class
}//end of driver

