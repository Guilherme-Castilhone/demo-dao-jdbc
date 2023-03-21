package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data = LocalDate.parse("23/09/1998", dtf);
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "Bob@gmail.com"
				,  data, 3000.00, obj);
		
		
		System.out.println(seller);
	}
}
