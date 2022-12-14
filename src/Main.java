import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //   String chosenNumber = sc.nextLine();

        Library library = new Library();
        library.addBook(new Book("harry potter", "jk rowling", "1994", "3", true));

        while (true) {
            System.out.println("1. Add a book to your library");
            System.out.println("2. Search for a book by name");
            System.out.println("3. List all available books");
            System.out.println("4. Return a book");
            System.out.println("5. Quit");

            int chosenNumber = sc.nextInt();


            if (chosenNumber == 1) {
                sc.nextLine();
                System.out.println("Write the book name");
                String bookName = sc.nextLine();
                System.out.println("Write the author");
                String authorName = sc.nextLine();
                System.out.println("Write the year it was written");
                String year = sc.nextLine();
                System.out.println("Write the edition");
                String upplaga = sc.nextLine();
                library.addBook(new Book(bookName, authorName, year, upplaga, true));


            } else if (chosenNumber == 2) {
                sc.nextLine();
                System.out.println("Which book are you looking for?");
                String bookName = sc.nextLine();
                System.out.println(library.findBook(bookName));
                System.out.println(library.findBook("harry potter"));

            } else if (chosenNumber == 3) {
                //list all books

                library.getAllBooks();

            } else if (chosenNumber == 4) {

                library.returnBook("harry potter");
                if (library.returnBook("harry potter")) {
                    System.out.println("Your book is returned");
                } else {
                    System.out.println("The book is not returned");
                }
                //return a book
            } else if (chosenNumber == 5) {
                System.out.println("Goodbye");
                break;
                //quit
            }
        }
    }
}



/*


Skriv en Main funktion som k??r ditt program:



Hur programmet ska bete sig f??r du hitta p?? sj??lv. T??nk p?? f??ljande:
* I alternativ 2, om den boken som man s??ker efter finns, d?? ska steget efter vara att fr??ga anv??ndaren om den vill l??na boken eller inte och forts??tta beroende p?? vad anv??ndaren matar in.
* G??r str??ngen som toString-metoden returnerar omfattande och presenterar informationen om boken p?? ett tydligt s??tt.


 */

