package com.tlk.service;

import com.tlk.dao.BookMapper;
import com.tlk.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;


public class BookServiceImpl implements BookService{
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);

    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();

    }
}
