
package com.curso.spring.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/exemplo")
public class ValidaApiController {
    
    @GetMapping("/{nome}")
    @PreAuthorize("hasRole('ADMIN')")
    public String exemplo(@PathVariable String nome) {
        return "Olá "+nome;
    }
    
}
