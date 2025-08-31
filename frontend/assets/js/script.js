/*
    Nome do Arquivo: script.js
    Descrição: Lógica de interatividade para as páginas de login e cadastro.
    Este código agora está corrigido para os testes de navegação e comunicação.
*/

const API_URL = 'http://127.0.0.1:8080/api';

// Função para a página de login
function setupLogin() {
    const formLogin = document.querySelector('form');
    if (formLogin) {
        formLogin.addEventListener('submit', async function(event) {
            event.preventDefault(); 
            
            const email = document.getElementById('emailInput').value;
            const password = document.getElementById('passwordInput').value;

            const loginData = {
                email: email,
                password: password
            };

            try {
                const response = await fetch(`${API_URL}/login`, {
                    method: 'POST',
                    headers: { 'Content-Type': 'application/json' },
                    body: JSON.stringify(loginData)
                });

                if (response.ok) {
                    console.log('Login bem-sucedido. Redirecionando...');
                    window.location.href = 'dashboard.html';
                } else {
                    const error = await response.json();
                    alert(`Erro no login: ${error.message || 'Credenciais inválidas.'}`);
                }

            } catch (error) {
                alert('Erro ao conectar com o servidor. Verifique se o back-end está rodando.');
                console.error('Erro de conexão:', error);
            }
        });
    }

    // Este é o "ouvinte" para o botão "Criar uma conta" na página de login.
    const btnCadastro = document.querySelector('a.btn-secondary');
    if (btnCadastro) {
        btnCadastro.addEventListener('click', function(event) {
            event.preventDefault();
            window.location.href = 'cadastro.html';
        });
    }
}

// Função para a página de cadastro
function setupCadastro() {
    const formCadastro = document.querySelector('form');
    if (formCadastro) {
        formCadastro.addEventListener('submit', async function(event) {
            event.preventDefault(); 
            
            const name = document.getElementById('nameInput').value;
            const email = document.getElementById('emailInput').value;
            const password = document.getElementById('passwordInput').value;
            const confirmPassword = document.getElementById('confirmPasswordInput').value;

            if (password !== confirmPassword) {
                alert('As senhas não coincidem. Por favor, tente novamente.');
                document.getElementById('passwordInput').value = '';
                document.getElementById('confirmPasswordInput').value = '';
                return;
            }

            const cadastroData = {
                name: name,
                email: email,
                password: password
            };
            
            try {
                const response = await fetch(`${API_URL}/register`, {
                    method: 'POST',
                    headers: { 'Content-Type': 'application/json' },
                    body: JSON.stringify(cadastroData)
                });

                if (response.ok) {
                    alert('Cadastro realizado com sucesso! Faça login para continuar.');
                    window.location.href = 'index.html';
                } else {
                    const error = await response.json();
                    alert(`Erro no cadastro: ${error.message || 'Não foi possível completar o cadastro.'}`);
                }

            } catch (error) {
                alert('Erro ao conectar com o servidor. Verifique se o back-end está rodando.');
                console.error('Erro de conexão:', error);
            }
        });
    }

    // Este é o "ouvinte" para o link "Já tem uma conta?" na página de cadastro.
    const btnLogin = document.querySelector('a.btn-link');
    if (btnLogin) {
        btnLogin.addEventListener('click', function(event) {
            event.preventDefault();
            window.location.href = 'index.html';
        });
    }
}

// Executa a função de configuração apropriada dependendo da página
if (window.location.pathname.endsWith('index.html') || window.location.pathname === '/') {
    setupLogin();
} else if (window.location.pathname.endsWith('cadastro.html')) {
    setupCadastro();
}