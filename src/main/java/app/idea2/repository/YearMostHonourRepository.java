package app.idea2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.idea2.entity.YearMostHonour;

@Repository
public interface YearMostHonourRepository extends JpaRepository<YearMostHonour, Integer>{

}
