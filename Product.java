public class Product{
	static String category = "Electronics";
	String productName;
	public static void main(String[] args){
		System.out.println("Category:" + Product.category);
		Product prod = new Product();
		prod.productName= "Laptop";
		Product prod1 = new Product();
		prod1.productName= "Smartphone";
		System.out.println("Product 2:"+ prod.productName);
		System.out.println("Product 1:"+ prod1.productName);
	}
}
	