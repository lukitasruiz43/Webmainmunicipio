<?php
 include("conexion.php");
error_reporting(E_ALL);
ini_set('display_errors', 1);
session_start();
?>

<!DOCTYPE html>
<html lang="es-ES">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style-login.css">
    <title>codice vitae</title>
</head>
<body>
    <form action="validar.php" class="main-login" method="POST">
        <div class="left-login">
            <h1> Bienvenidos a codice vitae!!<br></h1>
            <img src="Imagenes/doctores.png" class="left-login-image" style="left: 60px;">
        </div>
        
        <div class="right-login"></div>
        <div class="card-login">
            <div class="textflied">
                <label for="D.N.I">D.N.I</label>
                <input type="number" name="dni" placeholder="Numero de Documento">
            </div>
            <div class="textflied">
                <label for="contraseña">Contraseña</label>
                <input type="password" name="password" placeholder="Contraseña">
            </div>
            <button type="submit" name="login" class="btn-login">Inicio</button>
        </div>
    </form>
</body>
</html>

