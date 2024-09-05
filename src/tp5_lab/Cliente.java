package tp5_lab;


/**
 *
 * @author Joaco
 */
public class Cliente {
    
    int dni;
    String nombre,apellido,direccion,ciudad;
    Long telefono;

    public Cliente(int dni, String nombre, String apellido, String direccion, String ciudad, Long telefono ){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", ciudad=" + ciudad + '}';
    }
    
    
    
    

    
    

    
    
    
}
