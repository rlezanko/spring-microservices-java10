package pl.lezanko.examples.departments.entities;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * DepartmentEntity
 * pl.lezanko.examples.departments.entities
 * Created by Rafal Lezanko on 08.09.2018.
 */
@Data
@Entity
@Table(name = "DEPARTMENTS")
public class DepartmentEntity {

	@Id
	@GeneratedValue
	@Column(nullable = false, name = "ID")
	private Long id;

	@Column(nullable = false, name = "NAME")
	private String name;

	@Column(name = "DESCRIPTION")
	private String description;

	@OneToOne(cascade = CascadeType.ALL)
	private AddressEntity address;
}