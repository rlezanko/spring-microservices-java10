package pl.lezanko.examples.departments.services;

import pl.lezanko.examples.departments.entities.DepartmentEntity;

import java.util.Collection;

/**
 * DepartmentsService
 * pl.lezanko.examples.departments.services
 * Created by Rafal Lezanko on 08.09.2018.
 */
public interface DepartmentsService {
	Collection<DepartmentEntity> getAll();
	DepartmentEntity getById(Long id);
}