package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.Csv;
import com.vti.form.CsvCreateForm;
import com.vti.form.CsvUpdateForm;
import com.vti.repository.ICsvRepository;

@Service
public class CsvService implements ICsvService {

	@Autowired
	private ICsvRepository repository;

	@Override
	public List<Csv> getAllCsv() {
		return repository.findAll();
	}

	@Override
	public Csv getCsvById(int id) {

		return repository.getById(id);
	}

	@Override
	public void createCsv(CsvCreateForm form) {
		Csv csv = new Csv();
		csv.setFileName(form.getFileName());
		csv.setLink(form.getLink());
		repository.save(csv);
	}

	@Override
	public void updateCsv(int id, CsvUpdateForm form) {
		try {
			Csv csv = repository.getById(id);
			csv.setFileName(form.getFileName());
			csv.setLink(form.getLink());
			repository.save(csv);
		} catch (Exception e) {
			throw new Error();
		}

	}

	@Override
	public void deleteCsv(int id) {
		repository.deleteById(id);

	}

}
