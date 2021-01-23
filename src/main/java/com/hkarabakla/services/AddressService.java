package com.hkarabakla.services;

import com.hkarabakla.entities.Address;
import com.hkarabakla.repositories.AddressRepo;
import org.springframework.stereotype.Component;

import javax.management.remote.JMXAddressable;

@Component
public class AddressService {

    private final AddressRepo addressRepo;

    public AddressService(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    public void addressOperation(){

        Address address = new Address();

        address.setStreet("Berlin Street");
        address.setNumber("12");
        address.setCity("Berlin");
        address.setZipcode(12);


        addressRepo.save(address);


        System.out.println(addressRepo.findByCity("Berlin"));



    }
}
