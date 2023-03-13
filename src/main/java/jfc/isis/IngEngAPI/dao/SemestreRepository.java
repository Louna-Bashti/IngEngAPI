package jfc.isis.IngEngAPI.dao;


import jfc.isis.IngEngAPI.entity.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestreRepository extends JpaRepository<Semestre, Long> {
}
