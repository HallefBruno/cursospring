package com.curso.pring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
class CursospringApplicationTests {
    
    @Value("${nome.teste}")
    private String qtdPorPagina;
    
    @Test
    void contextLoads() {
        
    }
    
    @Test
    public void testCarregarContextDeTest() {
        if(qtdPorPagina.length() == 9) {
            System.out.println("okokokok");
        }
    }

}
