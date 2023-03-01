package com.example.anita.component;

import org.springframework.stereotype.Component;

@Component("excelReport")
public class ExcelReport implements IReport {

	@Override
	public void generateReport() {
		System.out.println("generating the excel report...");
		
	}

}
