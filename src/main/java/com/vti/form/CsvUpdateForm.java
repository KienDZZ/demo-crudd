package com.vti.form;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CsvUpdateForm {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	private String fileName;

	private String link;

	private LocalDateTime now = LocalDateTime.now();

	private String createdDate = dtf.format(now);

	public CsvUpdateForm() {
	}

	public CsvUpdateForm(String fileName, String link, String createdDate) {
		this.fileName = fileName;
		this.link = link;
		this.createdDate = createdDate;
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

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

}
