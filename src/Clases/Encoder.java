package Clases;

//Codigo de encriptacion MD5

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

public class Encoder {
    public String ecnode(String password){
        try{
            // Crear una instancia del algoritmo de hash MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            // Obtener el arreglo de bytes de la contraseña
            byte[] passwordBytes = password.getBytes();
            // Calcular el hash MD5 de la contraseña
            byte[] digest = md.digest(passwordBytes);
            // Convertir el hash a una representación hexadecimal
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch(NoSuchAlgorithmException e){
            JOptionPane.showMessageDialog(null, "Error al encriptar");
            e.printStackTrace();
            return null;
        }
    }
}