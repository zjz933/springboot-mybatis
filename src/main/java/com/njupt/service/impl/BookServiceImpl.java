package com.njupt.service.impl;

import com.njupt.dao.BookMapper;
import com.njupt.entity.BookEntity;
import com.njupt.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhaojunzhi on 2019/2/18.
 */
@Service
public class BookServiceImpl implements BookService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    private BookMapper bookMapper;

    @Override
    public BookEntity loadBookById(long bookId) {
        LOGGER.info("loadBookById...bookId = {}", bookId);
        return bookMapper.loadBookById(bookId);
    }
}
