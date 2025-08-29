package LMS_Package;
import java.util.Scanner;

public class Main {




    public static void main (String[] args){
        Librarian librarian = new Librarian();

        librarian.addBook();

        Scanner sc = new Scanner(System.in);
        System.out.println("Are you registered in the library? Answser it in the form of true or false");


        boolean askMemberForRegisteration = sc.nextBoolean();
        sc.nextLine();


        if(askMemberForRegisteration){
            String memberName;
            String bookName;

            System.out.println("Enter your name?");
            memberName = sc.nextLine();
            sc.nextLine();

            System.out.println("Enter your book name?");
            bookName = sc.nextLine();


            librarian.issueBook(memberName, bookName);

        }else{
            librarian.addMember();
        }





    }
}
