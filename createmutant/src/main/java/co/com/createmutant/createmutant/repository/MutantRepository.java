package co.com.createmutant.createmutant.repository;

import co.com.createmutant.createmutant.entity.MutantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MutantRepository extends JpaRepository<MutantEntity, String> {
}
