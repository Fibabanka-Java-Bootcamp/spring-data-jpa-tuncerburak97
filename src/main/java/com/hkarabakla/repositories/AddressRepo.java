package com.hkarabakla.repositories;

import com.hkarabakla.entities.Address;
import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface AddressRepo extends CrudRepository<Address,Integer> {

    public List<Address> findByCity(String city);

}
