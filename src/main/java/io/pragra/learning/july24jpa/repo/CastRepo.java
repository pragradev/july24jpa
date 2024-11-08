package io.pragra.learning.july24jpa.repo;

import io.pragra.learning.july24jpa.entity.CastDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CastRepo extends JpaRepository<CastDetail, Integer> {
}
