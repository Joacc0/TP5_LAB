package tp5_lab;

import java.util.Iterator;
import java.util.TreeMap;

/**
 *
 * @author Joaco
 */
public class Directorio {
    
    private String nombre,apellido,ciudad,direccion;
    private int dni;
    private long telefono;
    private Cliente contacto;
    private TreeMap<Long,Cliente> holaMap = new TreeMap<>();
    Iterator<Cliente> iterador;
    
    
    public Directorio(){
        
    }

    public Directorio(int dni, String nombre, String apellido, String direccion, String ciudad, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public Cliente getContacto(){
        return contacto;
    }
    
    public void agregarContacto(Cliente contacto){
        holaMap.put(contacto.getTelefono(),contacto);
    }
    
    public void buscarContacto(){
        while(iterador.hasNext()){
            Cliente contacto = iterador.next();
            long tel = contacto.getTelefono();
            System.out.println("Telefono: " + tel);
        }
    }
    
    public void buscarTelefono(){
        
    }
    
    public void buscarContactos(){
        
    }
    
    public void borrarContacto(){
        
    }
}
