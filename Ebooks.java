public class Ebooks extends Book {
    private String format = "PDF";

    Ebooks(int id , String title , String Author){
        super(id,title,Author);
    }
    @Override
    public void DisplayDetails(){
        System.out.println("*** Ebook Details ***");
        System.out.println("Id: " +getId()+ ", Title: " +getTitle()+", Author: " +getAuthor()+", Format: " +format);
    }
}
