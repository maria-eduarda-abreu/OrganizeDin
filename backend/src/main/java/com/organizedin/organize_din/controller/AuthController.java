package com.organizedin.organize_din.controller;

import com.organizedin.organize_din.dto.LoginRequest;
import com.organizedin.organize_din.dto.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://127.0.0.1:5500") // Adicione esta linha!
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        System.out.println("Requisição de Login recebida para o e-mail: " + request.getEmail());
        return ResponseEntity.ok("Login bem-sucedido!");
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
        System.out.println("Requisição de Cadastro recebida para o usuário: " + request.getName());
        return ResponseEntity.ok("Cadastro realizado com sucesso!");
    }
}