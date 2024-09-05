package Clases;


//import java.util.ArrayList;
//import java.util.Map;
//import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
//import java.util.TreeSet;

/**
 *
 * @author User
 */
public class Directorio {
    public static TreeMap<Long, Cliente> contactos;    // Declaro el TreeMap almacena clave y valor en este caso asocio telefono con obj cliente

    public Directorio() {
        Directorio.contactos = new TreeMap<>();
    }
    
    public static TreeMap<Long, Cliente> getContactos() {
        return contactos;
    }

    public static void setContactos(TreeMap<Long, Cliente> contactos) {
        Directorio.contactos = contactos;
    }

    public void agregarContacto(Long telefono, Cliente cliente) {
        contactos.put(telefono, cliente); //agrego un contacto con su clave y valor al TeeMap
        if (contactos.put(telefono, cliente) != null) {
            JOptionPane.showMessageDialog(null, "Cliente agregado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente NO agregado.");
        }
    }

    public Cliente buscarContacto(Long telefono) {
        if(contactos.get(telefono) == null){
            JOptionPane.showMessageDialog(null, "Contacto no encontrado.");
        }
        return contactos.get(telefono);                              //uso el get para buscar por nro de telefono y lo retorno
    }

    public HashSet<Long> buscarTelefono(String apellido) {   // le paso por parametro la busqueda por apellido
        HashSet<Long> telefonos = new HashSet();            //inicializo un nuevo treeMap para guardar los nros q correspondan al apellido 
        for (Map.Entry<Long, Cliente> entry : contactos.entrySet()) {   // Creo un forEach el setEntry devuelve las entradas clave, valor y permite ser iteradas
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) { //Para cada entrada, se obtiene el Cliente (valor) y se verifica si su apellido coincide con el parametro
                telefonos.add(entry.getKey());  //si coincide lo agrega al TreeMap y lo devuelve
            }
        }
        return telefonos;
    }

    public HashSet<Cliente> buscarContactos(String ciudad) {
        HashSet<Cliente> listaContactos = new HashSet<>();
        for (Cliente cliente : contactos.values()) {
            if (cliente.getCiudad().equalsIgnoreCase(ciudad)) {
                listaContactos.add(cliente);
            }
        }
        return listaContactos;
    }

    public void borrarContacto(Long telefono) {
        if (contactos.remove(telefono) != null) {
            JOptionPane.showMessageDialog(null, "Borrado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se ha borrado nada.");
        }
  }
    
}