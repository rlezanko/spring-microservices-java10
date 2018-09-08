package pl.lezanko.examples.departments;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * DepartmentsServiceConfiguration
 * pl.lezanko.examples.departments
 * Created by Rafal Lezanko on 08.09.2018.
 */
@Configuration
public class DepartmentsServiceConfiguration {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}