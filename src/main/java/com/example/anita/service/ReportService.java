package com.example.anita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.anita.component.IReport;

@Service
public class ReportService {
	@Autowired
	@Qualifier("excelReport")
	private IReport report;
	
	public void downloadReport() {
		report.generateReport();
	}
	

}
