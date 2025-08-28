package LMS_Package;

public class Librarian  {
    Book []books = new Book[3];

    public void addBook() {
        books[0] = new Book("Ramayana", "Maharishi Valmiki", 4.7f, 5);
        books[1] = new Book("Shri Madhbhagwat Geeta", "Lord Krishna", 5f, 2);
        books[2] = new Book("Mahabharat", "Maharishi Ved Vyash", 4.5f, 3);


        for (Book b: books){
            b.bookDetails();
            System.out.println("---------------------------------------------------");
        }
    }

}

