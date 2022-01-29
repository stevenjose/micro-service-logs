package com.mercantil.logSystem.log.repository;

import com.mercantil.logSystem.log.models.LogSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LogSystemRepository extends JpaRepository<LogSystem, Long> {

}
