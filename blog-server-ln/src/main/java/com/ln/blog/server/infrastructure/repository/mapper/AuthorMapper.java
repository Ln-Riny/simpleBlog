package com.ln.blog.server.infrastructure.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.ln.blog.server.infrastructure.repository.authors.Author;

/**
 * @author lining
 * @date 2022/2/10
 **/
@Mapper
//@Repository
public interface AuthorMapper {

    Long insertAuthor(Author author);

    void updateAuthor(Author author);

    Author queryById(Long id);
}