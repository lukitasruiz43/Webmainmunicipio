<<<<<<< HEAD:src/main/resources/static/ingresar.html
=======
<?php
 include("conexion.php");
error_reporting(E_ALL);
ini_set('display_errors', 1);
session_start();
?>
>>>>>>> c0072ef398e6d566e292d9a98d5361fd77e9c371:src/main/resources/static/ingresar.php

<!DOCTYPE html>
<html lang="es-ES">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style-login.css">
    <title>Huella Tecnica</title>
</head>
<body>
    <form action="validar.php" class="main-login" method="POST">
        <div class="left-login">
            <h1> Bienvenidos a Huella Tecnica<br><hr><br>
            By Ivis Corporation</h1>
            <img src="Imagenes" class="left-login-image" style="left: 60px;">
        </div>
        
        <div class="right-login"></div>
        <div class="card-login">
            <div class="textflied">
                <label for="Usuario">Usuario</label>
                <input type="text" name="Usuario" placeholder="Ingrese el usuario">
            </div>
            <div class="textflied">
                <label for="contraseña">Contraseña</label>
                <input type="password" name="password" placeholder="Contraseña">
            </div>
            <button type="submit" name="login" class="btn-login">Iniciar Sesion</button>
        </div>
    </form>
</body>
</html>

