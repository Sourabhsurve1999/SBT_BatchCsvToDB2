package com.sourabhsurve.SBT_BatchJobCsvTODB2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbtBatchJobCsvTodb2Application {

	public static void main(String[] args) {
		SpringApplication.run(SbtBatchJobCsvTodb2Application.class, args);
		System.out.println("Connected....");
	}

}
