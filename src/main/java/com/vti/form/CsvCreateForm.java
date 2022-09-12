package com.vti.form;


public class CsvCreateForm {

	private String fileName;

	private String link;
	

	public CsvCreateForm() {
	}

	public CsvCreateForm(String fileName, String link) {

		this.fileName = fileName;
		this.link = link;

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
	
}
