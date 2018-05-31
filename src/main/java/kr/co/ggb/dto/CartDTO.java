package kr.co.ggb.dto;

public class CartDTO {

	private String cartId;
	private String usersId;
	private String productId;

	public CartDTO() {
	}

	public CartDTO(String cartId, String usersId, String productId) {
		super();
		this.cartId = cartId;
		this.usersId = usersId;
		this.productId = productId;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public String getUsersId() {
		return usersId;
	}

	public void setUsersId(String usersId) {
		this.usersId = usersId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

}
