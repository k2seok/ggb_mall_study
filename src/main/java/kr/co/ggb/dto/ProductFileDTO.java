package kr.co.ggb.dto;

public class ProductFileDTO {

	private String productFileId;
	private int productId;
	private String fileName;
	private String savefileName;
	private String fileRegdate;

	public ProductFileDTO() {
		
	}
	public ProductFileDTO(String productFileId, int productId, String fileName, String savefileName, String fileRegdate) {
		super();
		this.productFileId = productFileId;
		this.productId = productId;
		this.fileName = fileName;
		this.savefileName = savefileName;
		this.fileRegdate = fileRegdate;
	}
	public String getProductFileId() {
		return productFileId;
	}

	public void setProductFileId(String productFileId) {
		this.productFileId = productFileId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getSavefileName() {
		return savefileName;
	}

	public void setSavefileName(String savefileName) {
		this.savefileName = savefileName;
	}

	public String getFileRegdate() {
		return fileRegdate;
	}

	public void setFileRegdate(String fileRegdate) {
		this.fileRegdate = fileRegdate;
	}

}
