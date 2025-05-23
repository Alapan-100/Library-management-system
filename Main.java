import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LibrarySystem lib = new LibrarySystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add E-Book");
            System.out.println("2. Add Printed Book");
            System.out.println("3. Display Book by ID");
            System.out.println("4. Update Book Title");
            System.out.println("5. Delete Book");
            System.out.println("6. List All Books");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter ID, Title, Author: ");
                        int id1 = sc.nextInt();
                        sc.nextLine();
                        String title1 = sc.nextLine();
                        String author1 = sc.nextLine();
                        lib.addBook(new Ebooks(id1, title1, author1));
                        break;
                    case 2:
                        System.out.print("Enter ID, Title, Author: ");
                        int id2 = sc.nextInt();
                        sc.nextLine();
                        String title2 = sc.nextLine();
                        String author2 = sc.nextLine();
                        lib.addBook(new PrintedBooks(id2, title2, author2));
                        break;
                    case 3:
                        System.out.print("Enter Book ID to Display: ");
                        int idDisplay = sc.nextInt();
                        lib.displayBook(idDisplay);
                        break;
                    case 4:
                        System.out.print("Enter Book ID to Update: ");
                        int idUpdate = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter New Title: ");
                        String newTitle = sc.nextLine();
                        lib.updateBookTitle(idUpdate, newTitle);
                        break;
                    case 5:
                        System.out.print("Enter Book ID to Delete: ");
                        int idDelete = sc.nextInt();
                        lib.deleteBook(idDelete);
                        break;
                    case 6:
                        lib.listAllBooks();
                        break;
                    case 7:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (BookNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("General Error: " + e.getMessage());
            } finally {
                System.out.println("Operation completed.");
            }
        }
    }
}
