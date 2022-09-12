package com.vti.service;

import java.util.List;

import com.vti.entity.Csv;
import com.vti.form.CsvCreateForm;

public interface ICsvService {

	public List<Csv> getAllCsv();
	
	public void createCsv(CsvCreateForm form);
	
	public void updateCsv();
	
	public void deleteCsv(int id);
}
