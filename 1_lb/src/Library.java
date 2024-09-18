import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String librarian;
    private String address;
    private String workingHours;
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<ReaderBook> readers = new ArrayList<ReaderBook>();

    public Library(){}

    public Library(String name){
        this.name = name;
    }

    public Library(String name, String address){
        this.name = name;
        this.address = address;
    }

    public Library(String name, String address, String workHours){
        this.name = name;
        this.address = address;
        this.workingHours = workHours;
    }
    public Library(String name, String address, String workHours, String librarian){
        this.name = name;
        this.address = address;
        this.workingHours = workHours;
        this.librarian = librarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLibrarian() {
        return librarian;
    }

    public void setLibrarian(String librarian) {
        this.librarian = librarian;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<ReaderBook> getReadersBooks() {
        return readers;
    }

    public void setReadersBooks(ArrayList<ReaderBook> readers) {
        this.readers = readers;
    }

    @Override
    public String toString(){
        return String.format("name : %s, address : %s, work hours : %s, librarian : %s, readers : %d",
                name, address, workingHours, librarian, readers.size());
    }

    public void addReaderBook(ReaderBook readerBook){
        readers.add(readerBook);
    }

    public void removeReaderBook(ReaderBook readerBook){
        readers.remove(readerBook);
    }

    public void addBookFromReader(ReaderBook readerBook, Book book){
        readerBook.addBook(book);
    }

    public void removeBookFromReader(ReaderBook readerBook, Book book){
        readerBook.removeBook(book);
    }

    public void booksFromReader(ReaderBook readerBook){
        ArrayList<Book> tmp = readerBook.getBooks();
        if (tmp.size() > 0 && tmp != null){
            for (Book book : tmp)
                System.out.println(book.toString());
        }
    }
    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

}
