//Autor Equipo1

package ContenidoB;
import Clases.UsuarioT;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionDB {
    String bd = "PFEquipo1";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "Kano";                           //Variables de tipo String que almacenaran datos para la conexion a la base
    String psw = "Royalzkano01";
    String driver = "com.mysql.cj.jdbc.Driver";
    
    Connection con; //con es de tipo Connection
    Statement st;
    ResultSet rs;
    
    public ConexionDB(String bd, String user, String psw) {
        con = null;
        st = null;
        rs = null;
        
        this.bd = bd;
        this.user = user;
        this.psw = psw;
    }
    
    public boolean conectar(){
        try{
            Class.forName(this.driver).newInstance();
            this.con = DriverManager.getConnection(url+bd, user, psw); //Le pasamos los datos al driver y se almacena en la variable con
            con.setAutoCommit(false); //Deacativamos el autocommit = 0;
            System.out.println("Conexion Establecida En: "+bd);
            return con != null;
        } catch(Exception e){
            System.out.println("No Se Conecto: "+e);
            return false;
        }
    }
    
    public void desconectar(){
        try{
            this.con.close();
        } catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    
    
    public Boolean addUser(UsuarioT xUsuario){
        try{
            st = con.createStatement();
            st.execute("INSERT INTO usuarioT (apellidoP, apellidoM, nombre, roll, usuario, contraseña) "
                    + "VALUES ('"+xUsuario.getApellidoPaterno()+"', '"+xUsuario.getApellidoMaterno()+"', '"+xUsuario.getNombre(
                    )+"', '"+xUsuario.getRoll()+"', '"+xUsuario.getUsuario()+"', '"+xUsuario.getContraseña()+"')");
            con.commit();
            return true;
        } catch(SQLException e){
            System.err.print(e.toString());
            if(con != null){
                    try {
                        JOptionPane.showMessageDialog(null, "Deshaciendo Cambios");
                        con.rollback();
                    } catch (SQLException ex) {
                        System.out.println("Error: "+ex);
                    }
                }
            return false;
        }
    }
    
    public UsuarioT getUsuario(String usuario) {
        UsuarioT xUsuario = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM usuarioT WHERE usuario = '" + usuario + "'");
            while (rs.next()) {
                xUsuario = new UsuarioT();
                xUsuario.setIdUsuario(rs.getInt("id"));
                xUsuario.setApellidoPaterno(rs.getString("apellidoP"));
                xUsuario.setApellidoMaterno(rs.getString("apellidoM"));
                xUsuario.setNombre(rs.getString("nombre"));
                xUsuario.setRoll(rs.getString("roll"));
                xUsuario.setUsuario(rs.getString("usuario"));
                xUsuario.setContraseña(rs.getString("contraseña"));
            }
            return xUsuario;
        } catch (SQLException e) {
            System.err.print(e.toString());
        }
        return xUsuario;
    }
    
    public void insertQuery(String apellidoP, String apellidoM, String nombre, String direccion, String tipoE, String descripcion, String precio, int opcion) {
        String queryInsert = "";

        switch (opcion) {
            case 1 -> {
                queryInsert = "INSERT INTO empleado (apellidoP, apellidoM, nombreE, direccion, tipoEmpleado) "
                        + "VALUES ('" + apellidoP + "', '" + apellidoM + "','" + nombre + "','" + direccion + "', '" + tipoE + "')";
            }
            case 2 -> {
                queryInsert = "INSERT INTO cliente (apellidoP, apellidoM, nombreC, direccion) "
                        + "VALUES ('" + apellidoP + "', '" + apellidoM + "','" + nombre + "','" + direccion + "')";
            }
            case 3 -> {
                queryInsert = "INSERT INTO proveedor (apellidoP, apellidoM, nombreP, direccion) "
                        + "VALUES ('" + apellidoP + "', '" + apellidoM + "','" + nombre + "','" + direccion + "')";
            }
            case 4 -> {
                queryInsert = "INSERT INTO producto (nombreProducto, descripcion, precio) "
                        + "VALUES ('" + nombre + "', '" + descripcion + "','" + precio + "')";
            }
        }

        try {
            st = con.createStatement();
            st.execute("BEGIN");
            st.executeUpdate(queryInsert);
            JOptionPane.showMessageDialog(null, "Registro Agregado");
            con.commit();

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            if (con != null) {
                try {
                    JOptionPane.showMessageDialog(null, "Deshaciendo Cambios");
                    con.rollback();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex);
                }
            }
        }
    }
    
    public void updateQuery(int id, String apellidoP, String apellidoM, String nombre, String direccion, String tipoE, String descripcion, String precio, int opcion){
        String queryUpdate = "";

        switch (opcion) {
            case 1 -> {
                queryUpdate = "UPDATE Empleado SET apellidoP='"+apellidoP+"',apellidoM='"+apellidoM+"', nombreE ='"+nombre+"', "
                        + "direccion='"+direccion+"', tipoEmpleado='"+tipoE+"' WHERE idEmpleado = "+id;
            }
            case 2 -> {
                queryUpdate = "UPDATE cliente SET apellidoP='"+apellidoP+"',apellidoM='"+apellidoM+"', nombreC ='"+nombre+"', "
                        + "direccion='"+direccion+"' WHERE idCliente = "+id;
            }
            case 3 -> {
                queryUpdate = "UPDATE proveedor SET apellidoP='" +apellidoP+ "',apellidoM='" +apellidoM+ "', nombreP ='" +nombre+ "', "
                        + "direccion='" + direccion + "' WHERE idProveedor = " + id;
            }
            case 4 -> {
                queryUpdate = "UPDATE producto SET nombreProducto='"+nombre+"',descripcion='"+descripcion+"', precio ='"+precio+"' WHERE idProducto = "+id;
            }
        }
        
        try {
            st = con.createStatement();
            st.execute("BEGIN");
            st.execute(queryUpdate);
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
            con.commit();

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            if (con != null) {
                try {
                    JOptionPane.showMessageDialog(null, "Deshaciendo Cambios");
                    con.rollback();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex);
                }
            }
        } 
    }
    
    public void deleteQuery(int id, int opcion){
        String queryDelete = "";

        switch (opcion) {
            case 1 -> {
                queryDelete = "DELETE FROM Empleado WHERE idEmpleado = " + id;
            }
            case 2 -> {
                queryDelete = "DELETE FROM Cliente WHERE idCliente = " + id;
            }
            case 3 -> {
                queryDelete = "DELETE FROM Proveedor WHERE idProveedor = " + id;
            }
            case 4 -> {
                queryDelete = "DELETE FROM Producto WHERE idProducto = " + id;
            }
        }
        
        try {
            st = con.createStatement();
            st.execute("BEGIN");
            st.execute(queryDelete);
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
            con.commit();

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            if (con != null) {
                try {
                    JOptionPane.showMessageDialog(null, "Deshaciendo Cambios");
                    con.rollback();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex);
                }
            }
        }
    }
}