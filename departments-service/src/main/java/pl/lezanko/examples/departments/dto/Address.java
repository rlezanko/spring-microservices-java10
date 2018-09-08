package pl.lezanko.examples.departments.dto;

import lombok.Data;

/**
 * Address
 * pl.lezanko.examples.departments.dto
 * Created by Rafal Lezanko on 08.09.2018.
 */
@Data
public class Address {
	private String street;
	private String city;
	private String zipCode;
	private String homeNumber;
}