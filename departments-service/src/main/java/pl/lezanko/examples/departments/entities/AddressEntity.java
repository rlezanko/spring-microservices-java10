package pl.lezanko.examples.departments.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AddressEntity
 * pl.lezanko.examples.departments.entities
 * Created by Rafal Lezanko on 08.09.2018.
 */
@Data
@Entity
@Table(name = "ADDRESSES")
public class AddressEntity {

	@Id
	@GeneratedValue
	@Column(nullable = false, name = "ID")
	private Long id;

	@Column(nullable = false, name = "STREET")
	private String street;

	@Column(nullable = false, name = "CITY")
	private String city;

	@Column(nullable = false, name = "ZIP_CODE")
	private String zipCode;

	@Column(nullable = false, name = "HOME_NUMBER")
	private String homeNumber;
}