package com.example.practica.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.practica.dto.User;
public interface IUserRepo extends JpaRepository <User, Integer>{

}
