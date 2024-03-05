package com.utxj.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utxj.users.usuarios.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}