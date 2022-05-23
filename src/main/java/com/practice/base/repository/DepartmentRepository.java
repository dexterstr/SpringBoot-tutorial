package com.practice.base.repository;

import com.practice.base.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// You need to mention class name and its primary key Data-type in <>
public interface DepartmentRepository extends JpaRepository<Department , Long> {
}
