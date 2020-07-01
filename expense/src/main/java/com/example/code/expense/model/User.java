package com.example.code.expense.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
@Data
public class User {
	
	@Id
	private Long id;
	
	private String name;
	
	private String email;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private User user;

}
