class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public Reader(String fullName, int libraryCardNumber, String faculty, String dateOfBirth, String phone) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }
    public String toString() {
        return "Full name: " + this.fullName + "\n"
                + "Card number: " + this.libraryCardNumber + "\n"
                + "Faculty: " + this.faculty + "\n"
                + "Date of birth: " + this.dateOfBirth + "\n"
                + "Phone: " + this.phone + "\n";
    }

    public void takeBook(int numBooks) {
        System.out.println(fullName + " took " + numBooks + " books");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " took books: ");
        for (int i = 0; i < bookTitles.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(bookTitles[i]);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " took books: ");
        for (int i = 0; i < books.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(books[i].getTitle());
        }
        System.out.println();
    }

    public void returnBook(int numBooks) {
        System.out.println(fullName + " returned " + numBooks + " books");
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " returned books: ");
        for (int i = 0; i < bookTitles.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(bookTitles[i]);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " returned books: ");
        for (int i = 0; i < books.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(books[i].getTitle());
        }
        System.out.println();
    }
    public String getFaculty() {
        return this.faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getLibraryCardNumber() {
        return this.libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber =libraryCardNumber;
    }
    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

}


