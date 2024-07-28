package com.deepu.security.oauthdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/home")
    public ResponseEntity<String> home(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return ResponseEntity.ok("Hello From Deepu's OAuth2 Demo App\n"+authentication.getCredentials()+"......\n\n"+authentication.getDetails()+"......\n\n"+authentication.getAuthorities()+"........\n\n"+authentication.getName()+"......\n\n"+authentication.getPrincipal());
    }
}
