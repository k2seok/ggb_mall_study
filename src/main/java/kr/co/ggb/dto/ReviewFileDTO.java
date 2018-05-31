package kr.co.ggb.dto;

public class ReviewFileDTO {
	private String reviewFileId;
	private int reviewNum;
	private String fileName;
	private String savefileName;
	private String fileRegdate;
	
	public ReviewFileDTO() {

	}
	public ReviewFileDTO(String reviewFileId, int reviewNum, String fileName, String savefileName, String fileRegdate) {

		this.reviewFileId = reviewFileId;
		this.reviewNum = reviewNum;
		this.fileName = fileName;
		this.savefileName = savefileName;
		this.fileRegdate = fileRegdate;
	}
	public String getReviewFileId() {
		return reviewFileId;
	}
	public void setReviewFileId(String reviewFileId) {
		this.reviewFileId = reviewFileId;
	}
	public int getReviewNum() {
		return reviewNum;
	}
	public void setReviewNum(int reviewNum) {
		this.reviewNum = reviewNum;
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
