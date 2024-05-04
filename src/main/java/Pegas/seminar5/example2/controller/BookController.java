package Pegas.seminar5.example2.controller;

import Pegas.seminar5.example2.entity.Book;
import Pegas.seminar5.example2.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    @GetMapping
    public List<Book> getAllBook(){
        return bookService.getAllBooks();
    }
}
