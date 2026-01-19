package edu.icet.Repository;

import edu.icet.model.dto.CustomerDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerDto,String> {
}
