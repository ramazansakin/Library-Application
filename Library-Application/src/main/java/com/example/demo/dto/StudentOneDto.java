package com.example.demo.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.example.demo.model.Book;
import com.example.demo.model.City;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Data
public class StudentOneDto {

	private Long id;

	private String tcNo;

	@NotNull
	private String fullname;

	private String university;

	private String department;

	@NotNull
	private String email;

	@NotNull
	private String phone;

	private String address;

	private City city;

	private Long bookId;

	private List<BookDtoForOneEntity> books;
}
