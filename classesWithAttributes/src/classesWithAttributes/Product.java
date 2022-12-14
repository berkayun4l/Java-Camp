package classesWithAttributes;

public class Product {
	
	public Product(int id, String name, String desciription, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı blok çalıştı");
		
		this.id=id;
        this.name=name;
        this.stockAmount=stockAmount;
        this.price=price;
        this.description=desciription;
        this.code=code;
        this.renk=renk;
	}
	
	public Product() {
		
	}
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String code;

	//getter 
	public int getId() {
		return id;
	}

	//setter
	public void setId(int id) {
		this.id = id; // this.id içinde bulunan claassı işaret eder 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	public String getCode() {
		return this.name.substring(0,1) + id;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
