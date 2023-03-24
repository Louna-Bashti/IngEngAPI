package jfc.isis.IngEngAPI.dao;

import jfc.isis.IngEngAPI.entity.Realisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealisationRepository extends JpaRepository<Realisation, Long> {
}
