package io.pragra.learning.july24jpa;

import io.pragra.learning.july24jpa.dto.GitUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "gitUserConsumer", url = "https://api.github.com")
public interface GitUserConsumer {
    @GetMapping("/users/{username}")
    GitUser getDataFromGithub(@PathVariable String username);
}
