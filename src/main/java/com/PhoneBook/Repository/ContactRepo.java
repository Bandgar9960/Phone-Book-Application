package com.PhoneBook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.PhoneBook.Model.Contact;


public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
