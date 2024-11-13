package io.pragra.learning.july24jpa.service;

import io.pragra.learning.july24jpa.entity.CastDetail;
import io.pragra.learning.july24jpa.repo.CastRepo;
import io.pragra.learning.july24jpa.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.Cast;
import org.springframework.stereotype.Service;

@Service
public class CastService {
    @Autowired
    private CastRepo castRepo;
    @Autowired
    private MovieRepo movieRepo;

    public CastDetail persistCasts(CastDetail castDetail){
        return castRepo.save(castDetail);
    }

}
