package dao;

import entity.Activite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActiviteRepository extends JpaRepository <Activite, Long> {
}
