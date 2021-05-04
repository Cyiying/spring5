package com.company.test;

import com.company.config.DruidConfig;
import com.company.entity.Book;
import com.company.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class BookTest {
    @Test
    public void addTest(){
        ApplicationContext act = new AnnotationConfigApplicationContext(DruidConfig.class);
        BookService bookService = act.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setId(0);
        book.setAuthor("程锐敏");
        book.setTitle("哈哈");
        book.setSubmission_date(new Date());
        bookService.add(book);
    }
}
