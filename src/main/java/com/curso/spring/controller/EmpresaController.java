
package com.curso.spring.controller;

import com.curso.spring.entity.Empresa;
import com.curso.spring.entity.Response;
import com.curso.spring.service.EmpresaService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("empresa")
public class EmpresaController {
    
    @Autowired
    private EmpresaService empresaService;
    
    @PostMapping
    public ResponseEntity<Response<Empresa>> salvar(@Valid @RequestBody Empresa empresa, BindingResult result) {
        Response<Empresa> response = new Response<>();
        if (result.hasErrors()) {
            result.getAllErrors().forEach(error -> response.getErros().add(error.getDefaultMessage()));
            return ResponseEntity.badRequest().body(response);
        }
        empresaService.salvar(empresa);
        return ResponseEntity.ok(response);
    }
    
}
