package LMS_Package;

import java.util.Date;

public class Loan  {
   private String name;
    private String title;
    private Date issueDate;
    private Date dueDate;

    public Loan(String name, String title, Date issueDate, Date dueDate){
        this.name = name;
        this.title = title;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }

    public void loanDetails(){
        System.out.println("name :"+ name +"\n"
        +"title :"+title+"\n"
                +"issueDate :"+issueDate+"\n"
                +"dueDate :"+dueDate
        );

    }
}
