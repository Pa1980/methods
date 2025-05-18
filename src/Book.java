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
}
