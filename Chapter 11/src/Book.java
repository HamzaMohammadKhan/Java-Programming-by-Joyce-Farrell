public class Book {
    private String title;
    private int NumberOfPages;

    public String getTitle(){
        return title;
    }
    public void setTitle(String t){
        title = t;
    }

    public int getNumberOfPages(){
        return NumberOfPages;
    }
    public void setNumberOfPages(int pg){
        NumberOfPages = pg;
    }
    public void displayAll(){
        System.out.println("The title is : " + title);
        System.out.println("The number of pages : " + NumberOfPages);
    }
}
