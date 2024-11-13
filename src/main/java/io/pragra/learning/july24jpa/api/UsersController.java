package io.pragra.learning.july24jpa.api;

import io.pragra.learning.july24jpa.dto.GitUser;
import io.pragra.learning.july24jpa.service.RestConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git/userName")
public class UsersController {
    @Autowired
    RestConsumeService restConsumeService;

    @GetMapping("/getUser")
    public GitUser getUserFromGitHub(@RequestParam String username){
        return restConsumeService.consumeGitHub(username);
    }
}
