package com.PhoneBook.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PhoneBook.Model.Contact;
import com.PhoneBook.Repository.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepo contactRepo;

	@Override
	public boolean saveContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Contact> getAllContact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		// TODO Auto-generated method stub
		return false;
	}

}
