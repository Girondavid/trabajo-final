/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgNegocio;

/**
 *
 * @author amartinez
 */
public class clsDAORegistro extends clsRegistro{
    pkgDatos.clsConecta con;

    public clsDAORegistro() {
        con = new pkgDatos.clsConecta();
    }
    
    public boolean registrar(){
        String SQL="insert into registro(ID_USER, contraseña, correo, hire_date, name_user)\n" +
"values('"+super.getId_user()+"','"+super.getContraseña()+"','"+super.getCorreo()+"', '"+super.getHire_date()+"', '"+super.getName_user()+"')";
        return con.procesarSQL(SQL);
    }
}
