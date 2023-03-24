package jfc.isis.IngEngAPI.dao;

import jfc.isis.IngEngAPI.entity.ChoixUE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoixUERepository extends JpaRepository<ChoixUE, Long> {
}
