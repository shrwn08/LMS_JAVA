package LMS_Package;

import java.util.Calendar;
import java.util.Date;

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

    public void addMember (){
        // name, age, idType = Adhar_Card, Voter_ID, School_ID
        if(countMember < members.length){
        members[0] = new Member("Akshay", 22, Member.IDType.Adhar_Card );
        countMember++;
        }

        for(Member m: members){
            if(m != null) {
                m.memberDetails();
                System.out.println("--------------------------------------------------------");
            }
        }
    }

    public void issueBook(String name, String title){
         Member member = null;
        Book book = null;

        Date issueDate = new Date();
        Calendar cal = Calendar.getInstance();

        cal.setTime(issueDate);
        cal.add(Calendar.DAY_OF_MONTH,7);
        Date dueDate = cal.getTime();

        for(Member m : members){
            if(m != null && m.getName().equalsIgnoreCase(name)){
                member = m;
                break;
            }
        }

        for(Book b : books){
            if(b!=null && b.title.equalsIgnoreCase(title)){
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
        if (book.numberOfBooks <= 0) {
            System.out.println("Book not available: " + title);
            return;
        }
        Loan firstLoan = new Loan(member.getName(),book.title,issueDate,dueDate);

        firstLoan.loanDetails();
        book.decreaseCopies();
    }


}

