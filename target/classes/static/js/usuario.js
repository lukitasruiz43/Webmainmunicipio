function crear(){  //variables
    inputusuario = document.querySelector("#nombres");
    inputapellido = document.querySelector("#apellido");
    inputdni = document.querySelector("#correo");
    inputcontraseña = document.querySelector("#contraseña");

    let datos = []; //vector
    datos.nombre = inputusuario.value;
    datos.apellido =inputapellido.value;
    datos.dni = inputdni.value;
    datos.password = inputcontraseña.value;

    
    console.log(datos.nombre);
    console.log(datos.apellido);
    console.log(datos.dni);
    console.log(datos.contraseña);
    
    //peticion

    fetch('http//localhost/api/usuarios',{
       method: 'POST', 
       node: 'no-cors',
       headers: {
        'Accept': 'application/json',
        'Content-Type':'application/json'
       },
       body: JSON.stringify(datos)
    }
    )
}