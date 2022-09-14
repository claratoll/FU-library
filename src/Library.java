import java.util.ArrayList;

public class Library {

        private ArrayList<Book> bookList = new ArrayList<Book>();

        public void addBook(Book book){
            bookList.add(book);
        }


        public Book findBook(String bookName){
            for (Book book : bookList){
                if(book.getName().equals(bookName)){
                    return book;
                }
            }
          return null;
        }

    public void getAllBooks(){
        for (Book book : bookList){
            if(book.isStatus()){
                System.out.println(book.toString());
            }
        }
    }

        public boolean loan (String bookName){
            Book book = findBook(bookName);
            if(book != null){
                if(book.isStatus()){
                    book.setStatus(false);
                    return true;
                }
            }
            return false;
        }

        public boolean returnBook(String bookName){
            Book book = findBook(bookName);
            if(book != null){
                if(!book.isStatus()){
                    book.setStatus(true);
                    return true;
                }
            }
            return false;
    }


    /*
Dessutom ska klassen Book ha:

Status ska vara tillgänglig by default när en bok skapas.
En metod loan som kollar om en bok går att låna eller inte(dvs tillgänglig eller inte) och göra följande:
Om boken är tillgänglig, då ska bokens status ändras till otillgänglig och metoden ska returnera true. Annars returnera false

En metod returnBook som gör motsatsen till loan.

     */
}
