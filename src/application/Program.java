package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TEST 1: findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n==== TEST 2: findByDepartment =====");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TEST 3: findAll =====");
		List<Seller> list2 = sellerDao.findAll();
		for (Seller obj: list2) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TEST 4: seller insert =====");
		Seller newSeller = new Seller(null,"Greg","greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n==== TEST 5: seller update =====");
		Seller newSeller2 = new Seller(8,"Bruce Benner","bruce.b@gmail.com", new Date(), 6000.0, department);
		sellerDao.update(newSeller2);
		System.out.println("Update completed!");
		
		System.out.println("\n==== TEST 6: seller delete =====");
		sellerDao.deleteById(11);
		sellerDao.deleteById(12);
		System.out.println("Seller deleted!");
		
	}

}
