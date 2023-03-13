package jfc.isis.IngEngAPI.dao;

import jfc.isis.IngEngAPI.entity.EstAffecteA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstAffecteARepository extends JpaRepository<EstAffecteA, Long> {
}
