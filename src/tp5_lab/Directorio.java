package tp5_lab;


//import java.util.ArrayList;
//import java.util.Map;
//import java.util.Set;
import java.util.TreeMap;
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

//    public void agregarContacto(Long telefono, Cliente cliente) {
//        contactos.put(telefono, cliente);                                          //agrego un contacto con su clave y valor al TeeMap
//    }
//
//    public Cliente buscarContacto(Long telefono) {
//        return contactos.get(telefono);                              //uso el get para buscar por nro de telefono y lo retorno
//    }
//
//    public Set<Long> buscarTelefono(String apellido) {   // le paso por parametro la busqueda por apellido
//        Set<Long> telefonos = new TreeSet<>();              //inicializo un nuevo treeMap para guardar los nros q correspondan al apellido 
//        for (Map.Entry<Long, Cliente> entry : contactos.entrySet()) {   // Creo un forEach el setEntry devuelve las entradas clave, valor y permite ser iteradas
//            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) { //Para cada entrada, se obtiene el Cliente (valor) y se verifica si su apellido coincide con el parametro
//                telefonos.add(entry.getKey());  //si coincide lo agrega al TreeMap y lo devuelve
//            }
//        }
//        return telefonos;
//    }
//
//    public ArrayList<Cliente> buscarContactos(String ciudad) {
//        ArrayList<Cliente> listaContactos = new ArrayList<>();
//        for (Cliente cliente : contactos.values()) {
//            if (cliente.getCiudad().equalsIgnoreCase(ciudad)) {
//                listaContactos.add(cliente);
//            }
//        }
//        return listaContactos;
//    }
//
//    public void borrarContacto(Long telefono) {
//        contactos.remove(telefono);
//  }
    
}