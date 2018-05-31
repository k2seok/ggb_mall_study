package kr.co.ggb.dto;

public class ProductsDTO {
	private String productId;
	private int stock;
	private String productName;
	private int price;
	private String content;
	private int categoryId;
	private String productRegdate;
	public ProductsDTO() {
		
	}
	public ProductsDTO(String productId, int stock, String productName, int price, String content, int categoryId,
			String productRegdate) {
		super();
		this.productId = productId;
		this.stock = stock;
		this.productName = productName;
		this.price = price;
		this.content = content;
		this.categoryId = categoryId;
		this.productRegdate = productRegdate;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductRegdate() {
		return productRegdate;
	}
	public void setProductRegdate(String productRegdate) {
		this.productRegdate = productRegdate;
	}
	
	
}
