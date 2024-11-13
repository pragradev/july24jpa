package io.pragra.learning.july24jpa.service;

import io.pragra.learning.july24jpa.dto.GitUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;

@Service
public class RestConsumeService {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    WebClient webClient;

//    public GitUser consumeGitHub(String username){
//        return restTemplate.getForObject("https://api.github.com/users/"+username, GitUser.class );
//    }

    public GitUser consumeGitHub(String username){
        return webClient.get()
                .uri("https://api.github.com/users/"+username)
                .retrieve()
                .bodyToMono(GitUser.class)
                .timeout(Duration.ofMillis(10000))
                .block();
    }
}
