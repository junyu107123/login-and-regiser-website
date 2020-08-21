package tw.com.repository;

import org.springframework.data.repository.CrudRepository;

import tw.com.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
