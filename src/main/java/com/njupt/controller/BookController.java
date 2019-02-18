package com.njupt.controller;

import com.njupt.entity.BookEntity;
import com.njupt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaojunzhi on 2019/2/18.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("load")
    public BookEntity loadBook(long bookId) {
        return bookService.loadBookById(bookId);
    }
}
