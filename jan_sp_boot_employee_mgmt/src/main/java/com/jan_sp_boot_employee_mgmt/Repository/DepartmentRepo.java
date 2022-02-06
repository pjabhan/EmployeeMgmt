package com.jan_sp_boot_employee_mgmt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jan_sp_boot_employee_mgmt.Model.DepartmentModel;


@Repository
public interface DepartmentRepo extends JpaRepository<DepartmentModel, Integer> {

}
