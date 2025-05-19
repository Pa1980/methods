import java.util.Objects;

public class Book {
    String title;
    Author bookName;
    private int year;
    public Book (String title, Author bookName, int year ) {
        this.title = title;
        this.bookName = bookName;
        this.year = year;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear( int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);// && Objects.equals(bookName, book.bookName);
        // year == book.year
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, bookName, year);
    }

    @Override
    public String toString() {
        return '"'+title+'"'+' '+bookName.getName()+' '+bookName.getSurname()+' '+year;

    }
}
