package todo.todooperations.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.todooperations.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    void deleteById(Long id);
    Optional<Employee> findById(Long id);
    List<Employee> findAll();
}
