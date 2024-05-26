package com.example.tmsfinal.dao;


import com.example.tmsfinal.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskDao extends JpaRepository<Order, Long>, JpaSpecificationExecutor<Order> {

    @Query(value = "select  ts.id, ts.created_data, ts.descriptions, ts.users_id from taskss ts where users_id in\n" +
            "(select us.id from usersss us where username = :name) and date_part('month', created_data) = :chousemounth", nativeQuery = true)


    List<Order> getTasks(@Param("name") final String name,
                         @Param("chousemounth") final Integer chousemounth);

}
