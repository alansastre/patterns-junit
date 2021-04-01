package mockito.iterator.iterator1;

import org.junit.jupiter.api.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Tag("database")// Es una etiqueta para que en la clase SuiteTest podamos definir que se ejecuten las clases
                // o métodos que queramos seleccionandolos por etiqueta "@Tag"
public class BookShop implements IBookShop {

    // Define the logger object for this class
    private final Logger log = LoggerFactory.getLogger(BookShop.class);

    // estructura datos interna
    List<Book> books;

    // constructor
    public BookShop(){
        books = new ArrayList<>();
    }

    // metodo para guardar datos en la estructura interna
    public void addBook(Book book){
        if(book != null)
            books.add(book);
    }

    // metodo que obtiene un libro en concreto
    public Optional<Book> getOne(int index) {
        if (index < 0)
            index = 0;

        if (index > this.getSize() - 1)
            index = this.getSize() - 1;

        return Optional.of(books.get(index)); // 0
    }

    // metodo que devuelve el tamaño de la librería
    public int getSize() {
        String message = "getSize(): " + books.size();
        log.debug(message);
        return books.size();
    }

    // iterador para recuperar elementos de la estructura interna
    @Override
    public CustomIterator iterator() {
        return new BookShopIterator();
    }

    // crear iterador
    private class BookShopIterator implements CustomIterator {

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return this.currentIndex < books.size();
        }

        @Override
        public Object next() {

            if(books.isEmpty())
                return false;

            return books.get(currentIndex++);
        }


    }
}
