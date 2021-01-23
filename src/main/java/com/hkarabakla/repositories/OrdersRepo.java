package com.hkarabakla.repositories;

import com.hkarabakla.entities.Orders;
import com.hkarabakla.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface OrdersRepo extends CrudRepository<Orders,Integer> {

    public List<Orders> findByUsersName(String name);


}
