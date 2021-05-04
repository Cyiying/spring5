package com.company.service;

import com.company.dao.BookDao;
import com.company.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void add(Book book){
        bookDao.add(book);
    }
}
