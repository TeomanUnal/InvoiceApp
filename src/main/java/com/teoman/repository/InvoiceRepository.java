package com.teoman.repository;

import com.teoman.model.Invoice;
import com.teoman.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    @Query("SELECT i FROM Invoice i WHERE i.user = :user AND i.approved = :approved")
    List<Invoice> findByUserAndApproved(@Param("user") User user, @Param("approved") boolean approved);

    @Query("SELECT i FROM Invoice i WHERE i.approved = :approved")
    List<Invoice> findByApproved(@Param("approved") boolean approved);

}
