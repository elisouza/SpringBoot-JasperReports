package org.uoldiveo.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uoldiveo.report.entity.Employee;
import org.websparrow.report.entity.Employee;

@Repository
public interface ReportRepository extends JpaRepository<Employee, Long> {

}
