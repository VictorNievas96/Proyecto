document.addEventListener("DOMContentLoaded", function() {
    verificarToken();
});

function verificarToken() {
    const token = localStorage.getItem('token');

    if (!token) {
        alert("Debes iniciar sesión para acceder a esta página.");
        window.location.href = 'login.html'; // Cambia a tu página de inicio de sesión
    } else {
        validarTokenEnServidor(token);
    }
}

async function validarTokenEnServidor(token) {
    const request = await fetch('api/validarToken', {
        method: 'GET',
        headers: {
            'Authorization': token
        }
    });

    if (request.status === 401) { // 401 Unauthorized
        alert("Token inválido o expirado. Inicia sesión nuevamente.");
        localStorage.removeItem('token');
        window.location.href = 'login.html';
    }
}
