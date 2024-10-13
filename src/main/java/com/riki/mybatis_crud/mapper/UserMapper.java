package com.riki.mybatis_crud.mapper;

import com.riki.mybatis_crud.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    // Mendapatkan semua pengguna
    List<User> getAllUsers();

    // Mendapatkan pengguna berdasarkan ID
    User getUserById(int id);

    // Menambahkan pengguna baru
    void insertUser(User user);

    // Memperbarui pengguna
    void updateUser(User user);

    // Menghapus pengguna
    void deleteUser(int id);
}
