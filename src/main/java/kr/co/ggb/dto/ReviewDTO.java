package kr.co.ggb.dto;

public class ReviewDTO {
	
	int reviewNum;
	String productId;
	String usersId;
	String content;
	String regDate;

	public ReviewDTO() {
	}
	public ReviewDTO(int reviewNum, String productId, String usersId, String content, String regDate) {
		this.reviewNum = reviewNum;
		this.productId = productId;
		this.usersId = usersId;
		this.content = content;
		this.regDate = regDate;
	}
	public int getReviewNum() {
		return reviewNum;
	}
	public void setReviewNum(int reviewNum) {
		this.reviewNum = reviewNum;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getUsersId() {
		return usersId;
	}
	public void setUsersId(String userId) {
		this.usersId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

}
