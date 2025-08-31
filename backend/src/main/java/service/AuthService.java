package com.organizedin.organize_din.service;

import com.organizedin.organize_din.dto.RegisterRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String registerUser(RegisterRequest request) {
        // Por enquanto, apenas retornamos uma mensagem de sucesso
        // No futuro, aqui teremos a lógica para salvar o usuário no banco de dados.
        System.out.println("Lógica de registro para o usuário: " + request.getName());
        return "Usuário registrado com sucesso!";
    }

    public String authenticateUser(String email, String password) {
        // Futuramente, aqui teremos a lógica de autenticação.
        System.out.println("Lógica de autenticação para o e-mail: " + email);
        return "Autenticação bem-sucedida!";
    }
}