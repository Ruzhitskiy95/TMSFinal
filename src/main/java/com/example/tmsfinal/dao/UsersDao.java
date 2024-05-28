package com.example.tmsfinal.dao;


import com.example.tmsfinal.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UsersDao extends JpaRepository<Users, Long>, JpaSpecificationExecutor<Users> {

    Users findUsersByLogin(final String login);

    Users findAllById(Integer id);

    List<Users> findAll();

    List<Users> findAllByOrderById();

    Users save(Users users);

    @Transactional
    @Modifying
    @Query(value = "UPDATE  users_roles  SET roles_id = :rolesIdParam WHERE users_id = :usersIdParam", nativeQuery = true)

    void updateUserRole(@Param("usersIdParam") final Integer usersIdParam,
                      @Param("rolesIdParam") final Integer rolesIdParam);

    @Transactional
    @Modifying
    @Query(value = "UPDATE  users  SET status = :statusParam WHERE id = :idParam", nativeQuery = true)

    void updateUserStatus(@Param("idParam") final Integer idParam,
                        @Param("statusParam") final String statusParam);

    @Query(value = "Select MAX(us.id) as maxId from users as us", nativeQuery = true)
    Integer getMaxUserId();


    @Transactional
    @Modifying
    @Query(value = "INSERT INTO users_roles (users_id, roles_id)  VALUES  (:idParam, 3)", nativeQuery = true)

    void insertRole(@Param("idParam") final Integer idParam);

    @Query(value = "select ur.users_id from users_roles ur where ur.users_id = (select us.id from users us where us.login =:loginParam)", nativeQuery = true)
    Integer getUserRoleId(@Param("loginParam") final String loginParam);
}
