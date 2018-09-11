package pl.lezanko.examples.departments.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.lezanko.examples.departments.dto.Department;
import pl.lezanko.examples.departments.entities.DepartmentEntity;
import pl.lezanko.examples.departments.services.DepartmentsService;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * DepartmentsController
 * pl.lezanko.examples.departments.controller
 * Created by Rafal Lezanko on 08.09.2018.
 */
@RestController
public class DepartmentsController {
	private final DepartmentsService departmentsService;
	private final ModelMapper modelMapper;

	public DepartmentsController(@Autowired DepartmentsService departmentsService
			, @Autowired ModelMapper modelMapper) {
		this.departmentsService = departmentsService;
		this.modelMapper = modelMapper;
	}

	@GetMapping("/departments")
	public Collection<Department> getDepartments() {
		Collection<DepartmentEntity> entities = departmentsService.getAll();
		return entities.stream()
				.map(it -> modelMapper.map(it, Department.class))
				.collect(Collectors.toList());
	}
}