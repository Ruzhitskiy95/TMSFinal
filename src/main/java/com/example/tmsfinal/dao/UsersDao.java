package com.example.tmsfinal.dao;


import com.example.tmsfinal.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersDao extends JpaRepository<Users, Long>, JpaSpecificationExecutor<Users> {

    Users findUsersByLogin(final String login);

    Users findAllById(Integer id);



//    @Query(value = "select us.id, us.department, us.name, us.password, us.username, count(ts.users_id) as kol from usersss us\n" +
//            "    inner join public.taskss ts on us.id = ts.users_id where us.department =\n" +
//            "            (select us.department from usersss us where username = :name) and date_part('month', created_data) = :chousemounth\n" +
//            "    group by us.id", nativeQuery = true)
//
//    List<Users> getUsersManagerDepartment(@Param("name") final String name,
//                                          @Param("chousemounth") final Integer chousemounth);
//
//
//    @Query(value = "select us.id, us.department, us.name, us.password, us.username, us.kol, ts.descriptions, ts.created_data from usersss us\n" +
//            " inner join public.taskss ts on us.id = ts.users_id where us.department =\n" +
//           " (select us.department from usersss us where username = :name) and date_part('month', created_data) = :chousemounth", nativeQuery = true)
//
//    List<Users> getUserManagerInfo(@Param("name") final String name,
//                                   @Param("chousemounth") final Integer chousemounth);
//
//    @Query(value = "select count(distinct us.id) as kol from usersss us\n" +
//            " inner join public.usersss_rolesss ur on us.id = ur.users_id\n" +
//            " where ur.roles_id = (select r.id from rolesss r where r.role = 'Manager')", nativeQuery = true)
//
//    Integer getManagerCount();
//
//    @Query(value = "select  us.id, us.department, us.name, us.password, us.username, count(t.users_id) as kol from usersss us inner join public.taskss t on us.id = t.users_id\n" +
//            "where date_part('month', created_data) = :chousemounth group by us.id", nativeQuery = true)
//
//    List<Users> getUsersDepartmentByMounth(@Param("chousemounth") final Integer chousemounth);
//
//    @Query(value = "select us.id, us.department, us.name, us.password, us.username, us.kol from usersss us\n" +
//            "    inner join public.taskss t on us.id = t.users_id\n" +
//            "    where us.department = (select us.department from usersss us where  us.username = :name)", nativeQuery = true)
//
//    List<Users> getManagerInfoAndDepartment(@Param("name") final String name);
//
//    @Query(value = "select us.id, us.department, us.name, us.password, us.username, us.kol from usersss us\n" +
//            "inner join public.taskss t on us.id = t.users_id\n" +
//            "where us.name = :name", nativeQuery = true)

//    List<Users> getUserInfoAndTasksByName(@Param("name") final String name);

    @Query(value = "select ur.users_id from users_roles ur where ur.users_id = (select us.id from users us where us.login =:loginParam)", nativeQuery = true)
    Integer getUserRoleId(@Param("loginParam") final String loginParam);
}
