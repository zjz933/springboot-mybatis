package com.njupt.entity;

/**
 * Created by zhaojunzhi on 2019/2/18.
 */
public class BookEntity {

    private long id;

    private String name;

    private int number;

    public long getBookId() {
        return id;
    }

    public void setBookId(Long bookId) {
        this.id = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
