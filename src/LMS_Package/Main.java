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

        String memberName;
        String bookName;

        System.out.println("Enter member's name?");
        memberName = sc.nextLine();

        System.out.println("Enter book name?");
        bookName = sc.nextLine();

        if(!askMemberForRegisteration){


            System.out.println("name: "+  memberName + "\n" +"book: "+ bookName);
            librarian.addMember();
            librarian.issueBook(memberName, bookName);

        }else{
            librarian.issueBook(memberName, bookName);
        }





    }
}
