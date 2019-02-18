package com.njupt.service;

import com.njupt.entity.BookEntity;

/**
 * Created by zhaojunzhi on 2019/2/18.
 */
public interface BookService {

    /**
     * 根据bookId查找Book信息
     *
     * @param bookId
     * @return
     */
    BookEntity loadBookById(long bookId);
}
