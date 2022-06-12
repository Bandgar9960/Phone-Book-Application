package com.PhoneBook.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "CONTACT_DETAILS")
@Setter
@Getter
@NoArgsConstructor
public class Contact {
	
	@Id
	@Column(name = "CONTACT_ID")
	private Integer contactId;
    
	@Column(name = "CONTACT_NAME")
	private String contactName;
	
	@Column(name = "CONTACT_NUMBER")
	private String contactNumber;
	
	@Column(name = "CONTACT_EMAIL")
	private String contactEmail;
	
	@Column(name = "ACTIVE_SWITCH")
	private Character activeSwitch;
	
	@Column(name = "CREATED_DATE")
	private LocalDate createdDate;
	
	@Column(name = "UPDATED_DATE")
	private LocalDate updatedDate;
	

}
