public class PrintedBooks extends Book {
    private String binding = "HardBinding";
    public PrintedBooks(int id , String title , String author){
        super(id , title , author);
    }
    @Override
    public void DisplayDetails(){
        System.out.println("*** Printed Book Details ***");
        System.out.println("ID: " + getId() + ", Title: " + getTitle() + ", Author: " + getAuthor() + ", Binding: " + binding);
    }
}
