package application;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createsSellerDao();
		
		System.out.println("------- Teste 1: seller findById -------");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n------- Teste 2: seller findByDepartment -------");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n------- Teste 3: seller findAll -------");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n------- Teste 4: seller insert -------");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.now(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Success! New ID: " + newSeller.getId());
		
		System.out.println("\n------- Teste 5: seller update -------");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Updated!");
		
		System.out.println("\n------- Teste 6: seller delete -------");
		System.out.print("Id for deletion: ");
		int id = entrada.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deleted!");
				
		entrada.close();
	}
}
