public class Main {
    public static void main(String[] args) {
        Author oneAuthor = new Author("Александр","Пушкин");
        Author twoAuthor = new Author("Михаил", "Булгаков");
        System.out.println(oneAuthor.getName()+" "+oneAuthor.getSurname());
        System.out.println(twoAuthor.getName()+" "+twoAuthor.getSurname());
        Book bookOne = new Book("Капитанская дочка", oneAuthor, 1936);
        Book bookTwo = new Book("Мастер и Маргарита", twoAuthor, 1940);
        System.out.println('"'+bookOne.title+'"'+" "+bookOne.bookName.getName()+" "+bookOne.bookName.getSurname()+" "+bookOne.getYear());
        System.out.println('"'+bookTwo.title+'"'+" "+bookTwo.bookName.getName()+" "+bookTwo.bookName.getSurname()+" "+bookTwo.getYear());
        System.out.println();
        bookOne.setYear(1836);
        System.out.println('"'+bookOne.title+'"'+" "+bookOne.bookName.getName()+" "+bookOne.bookName.getSurname()+" "+bookOne.getYear());
    }
}