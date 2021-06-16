package com.chen.controller;

import com.chen.pojo.Books;
import com.chen.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }
    //跳转到书籍添加页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }
    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook (books);
        //redirect:重定向
        return "redirect:/book/allBook";
    }
    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdateBookPaper(Model model, int id) {
        Books books = bookService.queryBookById(id);
        System.out.println(books);
        model.addAttribute("Abook",books );
        return "updateBook";
    }
    //修改书籍
    @RequestMapping("/updateBook")
    public String UpdateBook( Books books){
        int i = bookService.updateBook (books);
        if(i<0){
            System.out.println ("添加成功--->"+books );
        }

        return "redirect:/book/allBook";
    }
    //删除书籍
    @RequestMapping("/deleteBook{bookId}")
    private String toDeleteBook(@PathVariable("bookId")  int id){
        bookService.deleteBookById (id);
        return "redirect:/book/allBook";
    }
    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        Books books=bookService.queryBookName(queryBookName);
        System.out.println ("queryBook--->"+books );
        List<Books>list=new ArrayList<> ();
        list.add (books);
        if(books==null){
            list=bookService.queryAllBook();
            model.addAttribute ("error","未查到");
        }
        model.addAttribute("list", list);
        return "allBook";

    }
}
