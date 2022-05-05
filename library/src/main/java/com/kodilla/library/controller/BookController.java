package com.kodilla.library.controller;

import com.kodilla.library.mapper.BookMapper;
import com.kodilla.library.model.BookDto;
import com.kodilla.library.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @GetMapping
    public List<BookDto> getBooks() {
        return BookMapper.toBookDtoList(bookService.getBooks());
    }

    @PostMapping
    public void createBook(@RequestBody BookDto bookDto) {
        bookService.createBook(BookMapper.toBook(bookDto));
    }

    @DeleteMapping(path = "/{index}")
    public void deleteBook(@PathVariable("index") int index) {
        bookService.deleteBook(index);
    }
}
