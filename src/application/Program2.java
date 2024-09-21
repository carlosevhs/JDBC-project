package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: Insert =====");
		Department department = new Department(null,"Shopping");
		//departmentDao.insert(department);
		System.out.println(department);
		
		System.out.println("==== TEST 2: Update =====");
		Department department2 = new Department(6,"Shoes");
		departmentDao.update(department2);
		System.out.println("Update complete!");
		
		System.out.println("==== TEST 3: Deleted =====");
		departmentDao.deleteById(10);
		System.out.println("Delete complete!");
		
		System.out.println("==== TEST 4: FindById =====");
		Department dep = departmentDao.findById(2);
		System.out.println("Department found! " + dep);
		
		System.out.println("==== TEST 4: FindAll =====");
		List<Department> list = departmentDao.findAll();
		System.out.println("Departments:");
		for (Department d :list) {
			System.out.println(d);
		}
		
	}

}
