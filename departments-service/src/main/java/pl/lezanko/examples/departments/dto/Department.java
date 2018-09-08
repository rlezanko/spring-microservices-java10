package pl.lezanko.examples.departments.dto;

import lombok.Data;

/**
 * Department
 * pl.lezanko.examples.departments.dto
 * Created by Rafal Lezanko on 08.09.2018.
 */
@Data
public class Department {
	private String code;
	private String name;
	private String description;
	private Address address;
}