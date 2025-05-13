package com.example.appointment.repository;

import com.example.appointment.model.Doctor;
import com.example.appointment.model.Department;
import com.example.appointment.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findByDepartmentAndHospital(Department department, Hospital hospital);

    // DoctorRepository.java
    List<Doctor> findByDepartment_DepartmentId(Long departmentId);
}
