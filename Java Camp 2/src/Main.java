
public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade orası";

		Product product0 = new Product();
		product0.setName("Kahve Makinesi 0");
		product0.setUnitPrice(7500.00);
		product0.setUnitsInStock(3);
		product0.setDiscount(7.0);
		product0.setImageUrl("image1.jpg");

		Product product1 = new Product();
		product1.setName("Kahve Makinesi 1");
		product0.setUnitPrice(7500.00);
		product0.setUnitsInStock(3);
		product0.setDiscount(7.0);
		product0.setImageUrl("image2.jpg");

		Product product2 = new Product();
		product2.setName("Kahve Makinesi 2");
		product0.setUnitPrice(7500.00);
		product0.setUnitsInStock(3);
		product0.setDiscount(7.0);
		product0.setImageUrl("image3.jpg");

		Product[] products = { product0, product1, product2 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}

		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("555");
		individualCustomer.setCustomerNumber("123");
		individualCustomer.setLastName("Berkay");
		individualCustomer.setLastName("Unal");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhoneNumber("333");
		corporateCustomer.setCustomerNumber("234");
		corporateCustomer.setCompanyName("CompanyName");
		corporateCustomer.setTaxNumber("9090");
		
		Customer[] customers = {individualCustomer,corporateCustomer}; 

	}

}
