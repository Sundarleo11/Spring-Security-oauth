package com.easybytes.springsecurity.repository;

import com.easybytes.springsecurity.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ContactRepository extends CrudRepository<Contact, String> {
	
	
}