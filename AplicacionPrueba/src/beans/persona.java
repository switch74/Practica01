/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author CESDE
 */
public class persona {

    private int id_persona;
    private String nombre;
    private String apellidopaterno;
    private String apellidomaterno;

    /**
     * @return the id_persona
     */
    public int getId_persona() {
        return id_persona;
    }

    /**
     * @param id_persona the id_persona to set
     */
    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidopaterno
     */
    public String getApellidopaterno() {
        return apellidopaterno;
    }

    /**
     * @param apellidopaterno the apellidopaterno to set
     */
    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    /**
     * @return the apellidomaterno
     */
    public String getApellidomaterno() {
        return apellidomaterno;
    }

    /**
     * @param apellidomaterno the apellidomaterno to set
     */
    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

}
