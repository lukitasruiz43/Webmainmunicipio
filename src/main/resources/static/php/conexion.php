<?php
$servername = "localhost:8080";
$fullname = "root";
$password = "";
$dbname = 'login_huella';

$conexion = mysqli_connect("localhost:8080'", "root", "", "login_huella");

if (!$conexion) {
    die("Error al conectar con la base de datos: " . mysqli_connect_error());
}
?>
