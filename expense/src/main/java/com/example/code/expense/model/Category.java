package com.example.code.expense.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name="category")
@Data

public class Category {
	
	@Id
	private Long id;
	
	private String name;
	
	private String email;
	
	@OneToMany
	private Set<Category> category;
	
}
