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
public class clsRegistro {
    private String name_user;
    private String hire_date;
    private String correo;
    private String contraseña;
    private int Id_user;
    

    public clsRegistro() {
    }
    
    public String getName_user() {
        return name_user;
    }

    /**
     * @param name_user the name_user to set
     */
    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    /**
     * @return the hire_date
     */
    public String getHire_date() {
        return hire_date;
    }

    /**
     * @param hire_date the hire_date to set
     */
    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the Id_user
     */
    public int getId_user() {
        return Id_user;
    }

    /**
     * @param Id_user the Id_user to set
     */
    public void setId_user(int Id_user) {
        this.Id_user = Id_user;
    }
    
    
}
