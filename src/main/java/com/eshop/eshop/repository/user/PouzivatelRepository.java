package com.eshop.eshop.repository.user;

import com.eshop.eshop.entity.user.Pouzivatel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PouzivatelRepository extends JpaRepository<Pouzivatel, UUID> {
    boolean existsPouzivatelByPouzivatelskeMeno(String pouzivatelskeMeno);
    Pouzivatel findPouzivatelByPouzivatelskeMeno(String pouzivatelskeMeno);
    @Modifying
    @Query("update Pouzivatel p set p.admin = 1 where p.pouzivatelskeMeno = :pouzivatelskeMeno")
    void updateToAdminByPouzivatelskeMeno(@Param("pouzivatelskeMeno")String pouzivatelskeMeno);

    @Modifying
    @Query("update Pouzivatel p set p.admin = 0 where p.pouzivatelskeMeno = :pouzivatelskeMeno")
    void updateToUserByPouzivatelskeMeno(@Param("pouzivatelskeMeno")String pouzivatelskeMeno);

    int deletePouzivatelByPouzivatelskeMeno(String pouzivatelskeMeno);
}

