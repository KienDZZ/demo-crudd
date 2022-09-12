package com.vti.dto;

import java.sql.Date;

public class Csvdto {

	private String fileName;

	private String link;

	private Date createDate;

	public Csvdto() {

	}

	public Csvdto(String fileName, String link, Date createDate) {

		this.fileName = fileName;
		this.link = link;
		this.createDate = createDate;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
