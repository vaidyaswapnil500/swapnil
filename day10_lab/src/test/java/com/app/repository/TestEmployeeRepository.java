package com.app.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.pojos.Employee;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
class TestEmployeeRepository {
	
	@Autowired
	private EmployeeRepository empRepo;

	@Test
	void test() {
//		fail("Not yet implemented");
		assertNotNull(empRepo);
	}
	
	//write a test case to insert 3 employee records(saveAll)
	
	@Test
	void testSaveAllEmployee() {
		List<Employee> emps = List.of(
				new Employee("Rama", "Kher", "rama@gmail.com", "12345", "Pune","HR", LocalDate.of(2020, 10, 20), 45678),
				new Employee("Anish", "Kher", "anish@gmail.com", "2345", "Mumbai","Sales", LocalDate.of(2021, 1, 24), 55678));
		empRepo.saveAll(emps);
		assertEquals(2, emps.size());
		
	}

}
