package com.organizedin.organize_din.controller;

import com.organizedin.organize_din.dto.LoginRequest;
import com.organizedin.organize_din.dto.RegisterRequest;
import com.organizedin.organize_din.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        System.out.println("Requisição de Login recebida para o e-mail: " + request.getEmail());
        String responseMessage = authService.authenticateUser(request.getEmail(), request.getPassword());
        return ResponseEntity.ok(responseMessage);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
        System.out.println("Requisição de Cadastro recebida para o usuário: " + request.getName());
        String responseMessage = authService.registerUser(request);
        return ResponseEntity.ok(responseMessage);
    }
}