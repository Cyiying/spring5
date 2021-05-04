package com.company.dao;

import com.company.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add(Book book) {
        Object[] args = {book.getId(),book.getTitle(), book.getAuthor(), new Date()};
        String sql = "insert into book values (?,?,?,?)";
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }
}
