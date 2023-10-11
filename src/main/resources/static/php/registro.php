<?php
 include("conexion.php");
error_reporting(E_ALL);
ini_set('display_errors', 1);
session_start();

 if (isset($_POST['login'])) {
    if (strlen($_POST['nombre']) >= 1 && strlen($_POST['contraseña']) >= 1) {

         $nombre= trim($_POST['nombre']);
         $contraseña= trim($_POST['contraseña']);
         $consulta = "INSERT INTO datos (nombre, contraseña) VALUES ($nombre, $contraseña)";
         $resultado = mysqli_query($conexion,$consulta);
         if($resultado) {
            ?> 
	    	<h3 class="ok">¡Te has inscripto correctamente!</h3>
           <?php
	    } else {
	    	?> 
	    	<h3 class="bad">¡Ups ha ocurrido un error!</h3>
           <?php
	    }
    }   else {
	    	?> 
	    	<h3 class="bad">¡Por favor complete los campos!</h3>
           <?php
    }
}

?>

