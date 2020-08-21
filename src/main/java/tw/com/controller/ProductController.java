package tw.com.controller;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import tw.com.model.Book;
import tw.com.repository.BookRepository;

@Controller
public class ProductController {
	
	private BookRepository bookRepository;
	
	@Autowired
	 public ProductController(BookRepository bookRepository) {
		 this.bookRepository=bookRepository;
	 }
	
	@GetMapping("/product")
	public @ResponseBody Iterable<Book>allBooks(){
		return bookRepository.findAll();
	}
	
}
