package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"laptop","Apple macbook",5000,3,"midnight");
		
//		product.setId(1);
//		product.setName("Laptop");
//		product.setDescription("Apple Macbook");
//		product.setPrice(50000);
//		product.setStockAmount(3);
//		product.setRenk("midnight");
		
		ProductManager productManager = new ProductManager();
		
		productManager.Add(product);
		
		System.out.println(product.getCode());
		

	}

}
