package kr.co.ggb.dto;

public class QnaDTO {
	private int qnaboardId;
	private String productId;
	private String usersId;
	private String qnatitle;
	private String qnaContent;
	private String qnaRegdate;
	public QnaDTO() {

	}
	public QnaDTO(int qnaboardId, String productId, String usersId, String qnatitle, String qnaContent, String qnaRegdate) {
		super();
		this.qnaboardId = qnaboardId;
		this.productId = productId;
		this.usersId = usersId;
		this.qnatitle = qnatitle;
		this.qnaContent = qnaContent;
		this.qnaRegdate = qnaRegdate;
	}
	public int getQnaboardId() {
		return qnaboardId;
	}
	public void setQnaboardId(int qnaboardId) {
		this.qnaboardId = qnaboardId;
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
	public void setUsersId(String usersId) {
		this.usersId = usersId;
	}
	
	public String getQnatitle() {
		return qnatitle;
	}
	public void setQnatitle(String qnatitle) {
		this.qnatitle = qnatitle;
	}
	public String getQnaContent() {
		return qnaContent;
	}
	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}
	public String getQnaRegdate() {
		return qnaRegdate;
	}
	public void setQnaRegdate(String qnaRegdate) {
		this.qnaRegdate = qnaRegdate;
	}

}
