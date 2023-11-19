package com.example.projektgruptest.repo;

import com.example.projektgruptest.model.OkresRozliczeniowy;
import com.example.projektgruptest.model.Pracownik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OkresRozliczeniowyRepo extends JpaRepository<OkresRozliczeniowy,Long> {
}
