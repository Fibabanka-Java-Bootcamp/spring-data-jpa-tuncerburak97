package com.hkarabakla.repositories;

import com.hkarabakla.entities.Book;
import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface BookRepo extends CrudRepository<Book,String> {

    public List<Book> findByName(String name);

}
