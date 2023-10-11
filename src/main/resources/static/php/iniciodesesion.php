<?php
include("conexion.php");
ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Inicio de sesion </title>
    <link rel="stylesheet" href="./styles.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.0/animate.min.css">

</head>

<body>
<img src="imagenes\escuela.png" style="height: 60px;">
<h2 class="empresa"> Huella Digital<br>EEEST N°2 <br> Ing. Emilio Rebuelto Berisso</h2>    
<form action="index.html" class="form-box animated fadeInUp">
    <h4 class="form-title">Inicio de Sesion</h4>
    <input type="text" placeholder="nombre" autofocus>
    <input type="password" placeholder="Contraseña">
    <button type="submit">Iniciar sesion</button>
    <a class="contraseña" href="contraseña.html">¿Olvidaste tu contraseña?</a>
    <a class="registro" href="registrate.html">Registrate</a>
    </form>
</body>
</html>
