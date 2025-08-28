package LMS_Package;

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

    public void issueBook(){

    }


}

