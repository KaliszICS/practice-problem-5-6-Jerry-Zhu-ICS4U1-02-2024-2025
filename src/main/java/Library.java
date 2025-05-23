import java.util.ArrayList;

public class Library {
  private ArrayList<Book> books;

  public Library(ArrayList<Book> books){
    this.books = books;
  }

  public void addBook(Book book){
    books.add(book);
  }

  public void removeBook(String ISBN){
    for(int i = 0; i < books.size(); i++){
        if(ISBN.equals(books.get(i).getISBN())){
            books.remove(i);
            return;
        }
    }
  }


  public Book[] searchBook(String title){
    ArrayList<Book> matches = new ArrayList<Book>();
    int counter = 0;
    for(int i = 0; i < books.size(); i++){
        if(title.equals(books.get(i).getTitle())){
            matches.add(books.get(i));
            counter++;
        }
    }

    Book[] books2 = new Book[counter];
    for(int i = 0; i < counter; i++){
        books2[i] = matches.get(i);
    }

    return books2;
  }

  public Book[] displayBooks(){
    Book[] books2 = new Book[books.size()];
    for(int i = 0; i < books2.length; i++){
        books2[i] = books.get(i);
    }
    return books2;
  }


}
