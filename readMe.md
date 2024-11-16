custom methods in JPA
@Query -> HQL, JPQL
Native query
-> Fetchtyoe & cascade

-> Consuming of APIs, 
-> Exposing APIs 
ReachJS -> AXIOS (Http Client) framework
-> (Http clients) : Rest Template

spring reactive framework:-> WebClient 
Feign Client (Netflix) 

Async:-> 
sync:-> 

1) GitHub User: 
    postMan (username) -> app -> github -> got response -> postmn
   postMan (username) ->app -> check DB (check database) -> is exist then fetch it from DB and send to postman
    --> if not exist -> call Github -> save that data to DB -> send it to postman

    ---> execution must not goto github if that data is available in your DB

2)
make 2 application in you local,
8081 - expose Get, Post, Put, Patch, Delete
8082 - expose Get, Post, Consume 8081's Get, Post Put Delete

---------
call 8081 app endpoint from 8082 app

