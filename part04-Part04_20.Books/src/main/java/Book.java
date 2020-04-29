/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author weizheng
 */
public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book(String title, int numberOfPages, int publicationYear){
        this.title = title;
        this.pages = numberOfPages;
        this.year = publicationYear;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getAllDetails(){
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
