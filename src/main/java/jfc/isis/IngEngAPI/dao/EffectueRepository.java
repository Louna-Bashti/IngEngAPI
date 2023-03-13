package jfc.isis.IngEngAPI.dao;

import jfc.isis.IngEngAPI.entity.Effectue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EffectueRepository extends JpaRepository<Effectue, Long> {
}
