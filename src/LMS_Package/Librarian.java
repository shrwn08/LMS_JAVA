package LMS_Package;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Librarian  {
    private Member []members = new Member[10];
    private int countMember = 0;
    private Book []books = new Book[3];



    public void addBook() {
        //String title, String author, float rating, int numberOfBooks
        books[0] = new Book("Ramayana", "Maharishi Valmiki", 4.7f, 5);
        books[1] = new Book("Shri Madhbhagwat Geeta", "Lord Krishna", 5f, 2);
        books[2] = new Book("Mahabharat", "Maharishi Ved Vyash", 4.5f, 3);


        for (Book b: books){
            b.bookDetails();
            System.out.println("---------------------------------------------------");
        }
    }

    public void issueBook(String name, String title){


        Member member = null;
        Book book = null;

        String trimedName = name.trim();
        String trimedTitle = title.trim();

        Date issueDate = new Date();
        Calendar cal = Calendar.getInstance();

        cal.setTime(issueDate);
        cal.add(Calendar.DAY_OF_MONTH,7);
        Date dueDate = cal.getTime();

        for(Member m : members){
            if(m != null && m.getName().equalsIgnoreCase(trimedName)){
                member = m;
                break;
            }
        }



        for(Book b : books){
            if(b!=null && b.getTitle().equalsIgnoreCase(trimedTitle)){
                book = b;
                break;
            }
        }
        if (member == null) {
            System.out.println("Member not found: " + name);
            return;
        }
        if (book== null) {
            System.out.println("Book not found: " + title);
            return;
        }
        if (book.getNumberOfBooks() <= 0) {
            System.out.println("Book not available: " + title);
            return;
        }

        Loan firstLoan = new Loan(member.getName(),book.getTitle(),issueDate,dueDate);

        firstLoan.loanDetails();
        book.decreaseCopies();
    }

    public void addMember (){
        // name, age, idType = Adhar_Card, Voter_ID, School_ID

        Scanner sc = new Scanner(System.in);
        System.out.println("New Member name?");
        String name = sc.nextLine();

        System.out.println("Member's Age?");
        int age = sc.nextInt();
        sc.nextLine();

        Member.IDType idType = Member.IDType.Adhar_Card;
        System.out.println("Choose your Id: \n 1. Adhar_Card \n 2.Voter_ID \n 3. School_ID");
        int choice = sc.nextInt();
        switch (choice){
            case 1: idType =  Member.IDType.Adhar_Card;
            break;
            case 2: idType = Member.IDType.Voter_ID;
            break;
            case 3 : idType = Member.IDType.School_ID;
            break;
            default: System.out.println("invalid choice");
        }


        if(countMember < members.length){
        members[countMember] = new Member(name, age, idType );
        countMember++;
        }

        for(Member m: members){
            if(m != null) {
                m.memberDetails();
                System.out.println("--------------------------------------------------------");
            }
        }

        System.out.println("Enter the title name");
        String bookName = sc.nextLine();
        sc.nextLine();


    }

}

