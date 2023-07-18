package com.GreenStitch.CampusPlacements.repositories;

import com.GreenStitch.CampusPlacements.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public Optional<User> findByUsername(String email);
}
