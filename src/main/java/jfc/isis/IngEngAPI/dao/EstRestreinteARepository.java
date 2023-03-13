package jfc.isis.IngEngAPI.dao;

import jfc.isis.IngEngAPI.entity.EstRestreinteA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstRestreinteARepository extends JpaRepository<EstRestreinteA, Long> {
}
