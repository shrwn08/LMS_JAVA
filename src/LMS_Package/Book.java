package LMS_Package;

import java.util.Date;

public class Book {
   private String title;
    private String author;
   private float rating;
   private int numberOfBooks;

    public Book(String title, String author, float rating, int numberOfBooks){
        this.title = title;
        this.author = author;

        this.numberOfBooks = numberOfBooks;
    }

    public void bookDetails(){
        System.out.println("title : " +title +"\n"+ "author :"+author+ "\n" + "rating :"+rating+ "\n"+"numberOfBooks :"+ numberOfBooks);
    }

    public int decreaseCopies(){
        numberOfBooks -=1;
        return numberOfBooks;
    }
    public String getTitle(){
        return title;
    }

    public int getNumberOfBooks(){
        return numberOfBooks;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setRating(int rating){
        if(rating > 0 && rating <= 5 ) {
            this.rating = rating;
        }else{
            throw new IllegalArgumentException("Rating should be greater than 0 or less than and equal to 5");
        }
    }

    public void setNumberOfBooks(int numberOfBooks){
        this.numberOfBooks = numberOfBooks;
    }
}
