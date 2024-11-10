package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class DatosUsuario {
    String id;
    String nombre;
    String apellidos;
    String contra;
    Date nacimiento;
    int saldo;
    List<Objetos> objetos;
    static int lastId;


    public DatosUsuario() {
        this.setId(RandomUtils.getId());
    }
    public DatosUsuario(String nombre, String apellidos, String contra, Date nacimiento) {
        this(null, nombre,apellidos,contra, nacimiento);
    }
    public DatosUsuario(String id, String nombre, String apellidos, String contra, Date nacmiento) {
        this();
        if (id != null) this.setId(id);
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setContra(contra);
        this.setNacimiento(nacmiento);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        apellidos = apellidos;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public List<Objetos> getObjetos() {
        return objetos;
    }

    public void setObjetos(List<Objetos> objetos) {
        this.objetos = objetos;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void addObjeto(Objetos objeto){
        this.objetos.add(objeto);
    }

    @Override
    public String toString() {
        return "id="+id+", nombre=" + nombre + ", apellidos=" + apellidos +", nacimiento= "+nacimiento;
    }

}
