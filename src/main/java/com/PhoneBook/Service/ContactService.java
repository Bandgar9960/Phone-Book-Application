package com.PhoneBook.Service;

import java.util.List;

import com.PhoneBook.Model.Contact;

public interface ContactService {

	boolean saveContact(Contact contact);

	List<Contact> getAllContact();

	Contact getContactById(Integer contactId);

	boolean deleteContactById(Integer contactId);

}
