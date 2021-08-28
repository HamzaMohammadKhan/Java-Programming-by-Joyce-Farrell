public class LibraryBook {
    private String author;
    private String title;
    private int PageCount;

    public LibraryBook(String TitleBook, String BookAuthor, int BookPage){
        author = BookAuthor;
        title = TitleBook;
        PageCount = BookPage;
    }

    String getAuthor(){
        return author;
    }
    void setAuthor(String a){
        author = a;
    }
    String getTitle(){
        return title;
    }
    void setTitle(String t){
        title = t;
    }
    int getPageCount(){
        return PageCount;
    }
    void setPageCount(int p){
        PageCount = p;
    }

}
