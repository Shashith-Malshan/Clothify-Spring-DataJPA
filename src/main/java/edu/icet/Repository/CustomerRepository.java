package edu.icet.Repository;

import edu.icet.model.dto.CustomerDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDto,String> {

    @Modifying
    @Transactional
    @Query("UPDATE CustomerDto c SET c.name=:name,c.address=:address,c.phone=:phone WHERE c.id=:id")
    int update(@Param("id") String id,
               @Param("name") String name,
               @Param("address") String address,
               @Param("phone") String phone);
}
