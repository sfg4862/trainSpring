package com.mysite.sbb.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
    // JpaRepository<SiteUser, Long> 에서 뒤에 Long은 기본키 타입에 따라 결정

    Optional<SiteUser> findByUsername(String username);
}