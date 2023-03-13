package jfc.isis.IngEngAPI.dao;



import jfc.isis.IngEngAPI.entity.Ue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UeRepository extends JpaRepository<Ue, Long> {
}