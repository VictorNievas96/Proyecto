// Call the dataTables jQuery plugin
$(document).ready(function() {
  
  cargarUsuarios();
  $('#usuarios').DataTable();
  

});

async function cargarUsuarios(){
  
    const request = await fetch('api/usuarios', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
 
    });
    
    const usuarios = await request.json();
    
    let listadoHTML = '';

    for(let usuario of usuarios){

      let botonEliminar = '<a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';

      let usuarioHtml = '<tr><td> ' + usuario.id + '</td><td>' + usuario.nombre + ' ' + usuario.apellido + '</td><td>' 
      + usuario.email + '</td><td>' + usuario.telefono
      + '</td><td>' + botonEliminar + '</td></tr>';
      listadoHTML += usuarioHtml;

      //concatenacion de strings
    }

    document.querySelector('#usuarios tbody').outerHTML=listadoHTML
    
  
}