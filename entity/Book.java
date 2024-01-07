package entity;

public class Book {
    private String uid;
    private String bookName;
    private String author;
    private String genre;

    public String getUid(){
        return this.uid;
    }
    public String getBookName(){
        return this.bookName;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getGenre(){
        return this.genre;
    }

    public void  setUid(String uid){
        this.uid = uid;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }
}
