package com.Projeto.course.resources;

import com.Projeto.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")

public class UserResources {
//metodo que respode a requisição do tipo GET do http que responde no caminho users
    @GetMapping
    public ResponseEntity<User>findAll(){
        User u = new User(1L,"maria","Maria@gmail.com","999999","88082834");
        return ResponseEntity.ok().body(u);
    }
}
