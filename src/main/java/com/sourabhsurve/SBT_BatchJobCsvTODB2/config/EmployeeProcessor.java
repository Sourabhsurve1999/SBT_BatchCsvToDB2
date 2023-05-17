package com.sourabhsurve.SBT_BatchJobCsvTODB2.config;

import com.sourabhsurve.SBT_BatchJobCsvTODB2.entity.Employee;
import org.springframework.batch.item.ItemProcessor;

public class EmployeeProcessor implements ItemProcessor<Employee,Employee> {
    @Override
    public Employee process(Employee employee) throws Exception {
        return employee;
    }
}
