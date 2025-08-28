package LMS_Package;

public class Main {


    public static void main (String[] args){

    Librarian librarian = new Librarian();

    librarian.addBook();
    librarian.addMember();
    librarian.issueBook("Akshay", "Ramayana");


    }
}
