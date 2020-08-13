package com.example.demo.dao;
import com.example.demo.dto.UserDTO;
import java.util.List;

public interface UserDAO {
    List<UserDTO> selectUsers(UserDTO param) throws Exception;
}