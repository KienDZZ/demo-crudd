package com.vti.service;

import java.util.List;

import com.vti.entity.Csv;
import com.vti.form.CsvCreateForm;
import com.vti.form.CsvUpdateForm;

public interface ICsvService {

	public List<Csv> getAllCsv();
	
	public Csv getCsvById(int id);
	
	public void createCsv(CsvCreateForm form);
	
	public void updateCsv(int id, CsvUpdateForm form);
	
	public void deleteCsv(int id);
}
