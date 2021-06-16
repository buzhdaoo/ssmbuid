package com.chen.service.impl;

import com.chen.dao.BookDao;
import com.chen.pojo.Books;
import com.chen.service.BookService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public class BookServiceImpl implements BookService {

    //service调dao层

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    @Override
    public int addBook(Books books) {

        return bookDao.addBook (books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookDao.deleteBookById (id);
    }

    @Override
    public int updateBook(Books books) {
        return bookDao.updateBook (books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookDao.queryBookById (id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookDao.queryAllBook ();
    }

    @Override
    public Books queryBookName(String queryBookName) {

        return bookDao.queryBookName (queryBookName);
    }
}
