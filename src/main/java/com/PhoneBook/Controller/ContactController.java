package com.PhoneBook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.PhoneBook.Model.Contact;
import com.PhoneBook.Service.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;

	@RequestMapping("/contact")
	public String getController() {
		return "contact";

	}

	@GetMapping("/saveContact")
	public String saveContact(@ModelAttribute Contact contact) {

		boolean saveContact = contactService.saveContact(contact);

		if (saveContact == true) {
			return "success";
		}

		return "Contact Not Saved";

	}

}
