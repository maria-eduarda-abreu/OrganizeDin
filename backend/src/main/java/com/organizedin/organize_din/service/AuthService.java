package com.organizedin.organize_din.service;

import com.organizedin.organize_din.dto.LoginResponse;
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

    // Método modificado para retornar um objeto em vez de uma String
    public Optional<LoginResponse> authenticateUser(String email, String password) {
        Optional<User> userOptional = userRepository.findByEmail(email);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(password)) { // AVISO: Em produção, verificar senha criptografada.
                System.out.println("Autenticação bem-sucedida para o e-mail: " + email);
                LoginResponse response = new LoginResponse();
                response.setName(user.getName());
                response.setEmail(user.getEmail());
                return Optional.of(response);
            }
        }
        return Optional.empty(); // Retorna Optional vazio se as credenciais forem inválidas.
    }
}