package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.BookDAO;
import com.example.demo.entity.Book;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "*")
public class BookController {
	@Autowired
	private BookDAO dao;
	
	@GetMapping
	public List<Book> list() {
		return dao.findAll();
	}
	
	
	 // 📌 도서 등록 API
    @PostMapping
    public String insert(Book book) {
    	dao.save(book);
        return "OK";
    }
   

	
	
}
