package com.organizedin.organize_din.service;

import com.organizedin.organize_din.dto.RegisterRequest;
import com.organizedin.organize_din.model.User;
import com.organizedin.organize_din.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    private final UserRepository userRepository;

    @Autowired
    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String registerUser(RegisterRequest request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            return "Erro: O e-mail já está em uso.";
        }

        User newUser = new User();
        newUser.setName(request.getName());
        newUser.setEmail(request.getEmail());
        newUser.setPassword(request.getPassword()); // AVISO: Em produção, criptografar a senha é obrigatório!

        userRepository.save(newUser);
        System.out.println("Usuário registrado: " + newUser.getEmail());
        return "Usuário registrado com sucesso!";
    }

    public String authenticateUser(String email, String password) {
        Optional<User> userOptional = userRepository.findByEmail(email);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(password)) { // AVISO: Em produção, verificar senha criptografada.
                System.out.println("Autenticação bem-sucedida para o e-mail: " + email);
                return "Login bem-sucedido!";
            }
        }
        return "E-mail ou senha inválidos.";
    }
}