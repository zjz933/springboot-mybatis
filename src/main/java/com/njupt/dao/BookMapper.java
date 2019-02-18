package com.njupt.dao;

import com.njupt.entity.BookEntity;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zhaojunzhi on 2019/2/18.
 */
public interface BookMapper {

    BookEntity loadBookById(@Param("id") long id);

    int addBook(@Param("entity") BookEntity entity);

}
