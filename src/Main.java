public class Main {
    public static void main(String[] args) {
        Author oneAuthor = new Author("Александр","Пушкин");
        Author twoAuthor = new Author("Михаил", "Булгаков");
        Author threeAuthor = new Author("Jhon", "Keho");

        Book bookOne = new Book("Капитанская дочка", oneAuthor, 1936);
        Book bookTwo = new Book("Мастер и Маргарита", twoAuthor, 1940);
        Book bookThree = new Book("Квантовый воин", threeAuthor, 2011);//

        System.out.println();
        bookOne.setYear(1836);
        
        System.out.println("bookOne = " + bookOne);
        System.out.println("bookTwo = " + bookTwo);
        System.out.println("bookThree = " + bookThree);
        System.out.println(bookTwo.equals(bookThree));

        System.out.println(bookOne.hashCode());
        System.out.println(bookTwo.hashCode());
        System.out.println(bookThree.hashCode());
    }
}