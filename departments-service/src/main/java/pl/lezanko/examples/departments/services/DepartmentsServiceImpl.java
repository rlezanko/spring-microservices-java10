package pl.lezanko.examples.departments.services;

import org.springframework.stereotype.Service;
import pl.lezanko.examples.departments.entities.DepartmentEntity;

import java.util.Collection;
import java.util.Collections;

/**
 * DepartmentsServiceImpl
 * pl.lezanko.examples.departments.services
 * Created by Rafal Lezanko on 08.09.2018.
 */
@Service
public class DepartmentsServiceImpl implements DepartmentsService {
	@Override
	public Collection<DepartmentEntity> getAll() {
		return Collections.emptySet();
	}

	@Override
	public DepartmentEntity getById(Long id) {
		return null;
	}
}