public class LibraryBookSort {
    public static void main(String[] args){
        LibraryBook[] book = new LibraryBook[5];
        book[0] = new LibraryBook("Heh", "re", 9);
        book[1] = new LibraryBook("yo", "be", 10);
        book[2] = new LibraryBook("pe", "ce", 11);
        book[3] = new LibraryBook("oip", "yu", 34);
        book[4] = new LibraryBook("nio", "auto", 23);
        book[5] = new LibraryBook("po", "too", 4);

        for(int x=0; x < book.length; ++x){
            book[x].getAuthor();
            book[x].getTitle();
            book[x].getPageCount();
            for(int y=0; y < book.length; ++y)
            System.out.println(book[x].getAuthor() + "\n" + book[x].getTitle() + "\n" + book[x].getPageCount());
        }
    }
}
