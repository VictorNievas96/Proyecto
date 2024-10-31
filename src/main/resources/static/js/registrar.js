$(document).ready(function(){


});

async function registrarUsuario(){
    let datos={};
    datos.nombre = document.getElementById('txtNombre').value;
    datos.apellido = document.getElementById('txtApellido').value;
    datos.email = document.getElementById('txtEmail').value;
    datos.telefono = document.getElementById('txtTelefono').value;
    datos.password = document.getElementById('txtPassword').value;
    let repetirPassword=document.getElementById('txtRepetirPassword').value;
    if(repetirPassword!==datos.password){
        alert('La contraseña no coincide');
        return;
    }
   


        // Envía la solicitud POST al servidor
        const request = await fetch('api/usuarios', {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(datos)
        });


        // Verifica si la solicitud fue exitosa
        if (request.ok) {
            alert('Usuario registrado con éxito');
            window.location.href='login.html';
        } else {
            alert('Error al registrar usuario');
        }
        
        //const usuarios = await request.json(); maneja si hay una sesion de usuario

}