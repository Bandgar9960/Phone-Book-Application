package com.PhoneBook.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer contactId;
    
	@Column(name = "CONTACT_NAME")
	@NotEmpty
	@Size(min = 3,message = "Min Size Of Name is 3")
	private String contactName;
	
	@Column(name = "CONTACT_NUMBER")
	@NotEmpty
	private String contactNumber;
	
	@Column(name = "CONTACT_EMAIL")
	@Email
	private String contactEmail;
	
	@Column(name = "ACTIVE_SWITCH")
	private Character activeSwitch;
	
	@Column(name = "CREATED_DATE")
	@CreationTimestamp
	private LocalDate createdDate;
	
	@Column(name = "UPDATED_DATE")
	@UpdateTimestamp
	private LocalDate updatedDate;
	

}
