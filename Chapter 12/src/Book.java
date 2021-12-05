public abstract class Book {
    String bookTitle;
    double bookPrice;

    public Book(){
        getBookTitle();
        getBookPrice();
    }

    public String getBookTitle(){
        return bookTitle;
    }
    public double getBookPrice(){
        return bookPrice;
    }
    public void setBookTitle(String name){
        bookTitle = name;
    }
    public void setBookPrice(double p){
        bookPrice = p;
    }

    public abstract void setPrice();

}
