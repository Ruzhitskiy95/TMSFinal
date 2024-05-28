package com.example.tmsfinal.dao;

import com.example.tmsfinal.model.Order;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public interface OrdersDao extends JpaRepository<Order, Long>, CrudRepository<Order, Long> {


    @Transactional
    @Modifying
    @Query(value = "delete from orders  where id = :idparam ", nativeQuery = true)

    void deleteOrdersByUserId(@Param("idparam") final Integer idparam);

    Order save(Order order);

    List<Order> findAllByOrderById();

    @Query(value = "Select MAX(ord.id) as maxId from orders as ord", nativeQuery = true)
    Integer getMaxId();

    @Transactional
    @Modifying
    @Query(value = "UPDATE  orders  SET users_id = :usersidparam WHERE id = :idparam", nativeQuery = true)

    void updateUserId(@Param("usersidparam") final Integer usersidparam,
                    @Param("idparam") final Integer idparam);

    @Transactional
    @Modifying
    @Query(value = "UPDATE  orders  SET \n" +
            "brand = :brandparam, \n" +
            "model = :modelparam, \n" +
            " releasedatefrom = :releasedatefromparam, \n" +
            " releasedateto = :releasedatetoparam, \n" +
            "enginecapacityfrom = :enginecapacityfromparam, \n" +
            "enginecapacityto = :enginecapacitytoparam, \n" +
            "transmission = :transmissionparam, \n" +
            "carbody = :carbodyparam, \n" +
            "pricefrom = :pricefromparam, \n" +
            "priceto = :pricetoparam \n" +
            " WHERE id = :idparam", nativeQuery = true)

    void updateById(@Param("brandparam") final String brandparam,
                    @Param("modelparam") final String modelparam,
                    @Param("releasedatefromparam") final Integer releasedatefromparam,
                    @Param("releasedatetoparam") final Integer releasedatetoparam,
                    @Param("enginecapacityfromparam") final Integer enginecapacityfromparam,
                    @Param("enginecapacitytoparam") final Integer enginecapacitytoparam,
                    @Param("transmissionparam") final String transmissionparam,
                    @Param("carbodyparam") final String carbodyparam,
                    @Param("pricefromparam") final Integer pricefromparam,
                    @Param("pricetoparam") final Integer pricetoparam,
                    @Param("idparam") final Integer idparam);

    @Query(value = "Select * from orders where users_id = :usersIdParam order by orders.id", nativeQuery = true)
    List<Order> findAllByUsersId(@Param("usersIdParam") final Integer usersIdParam);

    @Query(value = "Select users_id from orders where id = :idParam", nativeQuery = true)
    Integer findAUsersIdForDeleteOrder(@Param("idParam") final Integer idParam);


}
