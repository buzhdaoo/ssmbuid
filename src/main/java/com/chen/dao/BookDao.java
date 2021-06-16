package com.chen.dao;

import com.chen.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {
    //增加一本书
    int addBook(Books books);
    //删除一本书
  int deleteBookById(@Param ("bookId")int id);

    //更新一本书
    int updateBook( Books books);

    //查询一本书
    Books queryBookById(@Param ("bookId")int id);

    //查询全部书
    List<Books>queryAllBook();

    Books queryBookName(String bookName);
}
