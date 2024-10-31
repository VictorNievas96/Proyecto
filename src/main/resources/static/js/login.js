$(document).ready(function(){

});

async function iniciarSesion(){
    let datos={};
    datos.email = document.getElementById('txtEmail').value;
    datos.password = document.getElementById('txtPassword').value;
    
    

        // Envía la solicitud POST al servidor
        const request = await fetch('api/login', {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(datos)
        });


      
        //const respuesta = await request.json(); //maneja si hay una  sesion de usuarios
        const respuesta = await request.text();
        
        if(respuesta != "Fail"){
            localStorage.token = respuesta;
            localStorage.email = datos.email;
            window.location.href='usuarios.html';
            
        }else {
            alert("Las credenciales son incorrectas");
        }

}