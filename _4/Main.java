public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Jacob", 49, "medicine", "04.09.95", "8473290");
        reader.returnBook("Science", "Encyclopedia");
        reader.takeBook("Algebra", "History", "Calculus");
        reader.takeBook(3);
        reader.returnBook(2);
        reader.returnBook(new Book("Adventures", "Adamson Smith"), new Book("Dictionary", "Davies Smith\t"));
        reader.takeBook(new Book("Adventures", "Adamson Smith"), new Book("Dictionary", "Davies Smith\t"));

        Reader[] readers = new Reader[3];

        readers[0] = new Reader("Amina", 4, "SE", "06.04", "5324");
        readers[1] = new Reader("Saya", 5, "Cybersecurity", "12.04", "5434");
        readers[2] = new Reader("Denis", 1, "ITM", "23.04", "4334");
        for (Reader i : readers) {
            System.out.println(i);

        }


    }
}

