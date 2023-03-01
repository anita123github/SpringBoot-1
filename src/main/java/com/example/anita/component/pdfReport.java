package com.example.anita.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pdfReport") 
//@Primary 
public class pdfReport implements IReport {

	@Override
	public void generateReport() {
		System.out.println("generatin the pdf report......");
		
	}

}
