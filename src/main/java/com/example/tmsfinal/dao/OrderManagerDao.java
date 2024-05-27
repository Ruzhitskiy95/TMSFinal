package com.example.tmsfinal.dao;

import com.example.tmsfinal.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


public interface OrderManagerDao extends JpaRepository<Order, Long>, CrudRepository<Order, Long> {

    Order findAllById(Integer id);

    @Query(value = "Select users_id from orders where id = :idParam", nativeQuery = true)
    Integer findAUsersIdForEmailSend(@Param("idParam") final Integer idParam);


    @Transactional
    @Modifying
    @Query(value = "UPDATE  orders  SET status = :statusparam, acceptdate = :acceptdateparam WHERE id = :idparam", nativeQuery = true)

    void updateOrderStatusAccept(@Param("statusparam") final String statusparam,
                                 @Param("acceptdateparam") final Date acceptdateparam,
                                 @Param("idparam") final Integer idparam);

    @Transactional
    @Modifying
    @Query(value = "UPDATE  orders  SET status = :statusparam, closedate = :closedateparam WHERE id = :idparam", nativeQuery = true)

    void updateOrderStatusClose(@Param("statusparam") final String statusparam,
                                 @Param("closedateparam") final Date closedateparam,
                                 @Param("idparam") final Integer idparam);

    @Query(value = "SELECT * FROM orders WHERE status = :statusparam ORDER BY id", nativeQuery = true)
    List<Order> findAllByStatusManager(@Param("statusparam") final String statusparam);


}


