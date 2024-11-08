package io.pragra.learning.july24jpa.api;

import io.pragra.learning.july24jpa.entity.CastDetail;
import io.pragra.learning.july24jpa.service.CastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cast")
public class CastController {
    @Autowired
    private CastService castService;

    @PostMapping
    public CastDetail addCastDetail(@RequestBody CastDetail castDetail){
        return castService.persistCasts(castDetail);
    }
}
