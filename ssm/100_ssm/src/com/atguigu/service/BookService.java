package com.atguigu.service;

import com.atguigu.pojo.Book;

import java.util.List;

public interface BookService {

    public void saveBook(Book book);

    public void updateBook(Book book);

    public void deleteBookById(Integer id);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();

}
