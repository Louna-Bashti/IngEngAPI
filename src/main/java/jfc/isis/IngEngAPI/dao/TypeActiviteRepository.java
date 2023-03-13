package jfc.isis.IngEngAPI.dao;


import jfc.isis.IngEngAPI.entity.TypeActivite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeActiviteRepository extends JpaRepository<TypeActivite, Long> {
}
