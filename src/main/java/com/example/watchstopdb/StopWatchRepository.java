package com.example.watchstopdb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface StopWatchRepository extends JpaRepository<StopWatch, String> {
}
