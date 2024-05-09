package com.atuka.manageemplyee.Repository;

import com.atuka.manageemplyee.Model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository
        extends JpaRepository<EmployeeModel,Integer> {
}
