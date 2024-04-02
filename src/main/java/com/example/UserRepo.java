package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo extends JpaRepository<User,Integer> {

    @Query(value="select * from bookstore where email=:email and password=:password",nativeQuery=true)
    List<User> getbyemailandpassword(String email,String password);

}
