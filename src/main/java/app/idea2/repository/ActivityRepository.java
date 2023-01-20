package app.idea2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.idea2.entity.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer>{

}
