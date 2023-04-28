package servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import modelos.Cliente;

/**
 *
 * @author angel
 */
public class ClientesServicio {

    private ArrayList<Cliente> clientes;
    public final String[] colunmasNombres
            = {
                "Id",
                "Nombre",
                "DNI",
                "Direccion",
                "Telefono",
                "Email"
            };

    public ArrayList<Cliente> getClientes(String search) {
        int id;
        ArrayList<Cliente> clientesFiltrados = new ArrayList<>();

        if (search.isEmpty()) {
            return clientes;
        } else {
            id = Integer.parseInt(search);
            for (Cliente cliente : clientes) {
                if (cliente.getId() == id) {
                    clientesFiltrados.add(cliente);
                }
            }
        }
        return clientesFiltrados;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ClientesServicio() {
        clientes = new ArrayList<>();
        Cliente c1 = new Cliente(
                1,
                "Juan Perez",
                "1234567",
                "bo. el Progreso",
                "123434",
                "fgddfgdrr4");
        
        Cliente c2 = new Cliente(
                2,
                "Maria Mejia",
                "5432323",
                "bo. Dolores",
                "98544534",
                "fgd@gfhtt7");
        
        clientes.add(c1);
        clientes.add(c2);
    }

    public ArrayList<Cliente> verTodos() {
        return this.clientes;
    }

    public boolean agregar(Cliente cliente) {
        this.clientes.add(cliente);
        return true;
    }

    public boolean editar(Cliente cliente) {
        int indice = 0;
                
        for(Cliente c: clientes ){
            if(c.getId() == cliente.getId()){
                break;
            }
            indice++;
        }
        
        clientes.remove(indice);
        clientes.add(cliente);
       
        Collections.sort(clientes);
        return true;
    }

    public boolean borrar(int id) {
        int indice = 0;
                
        for(Cliente c: clientes ){
            if(c.getId() == id){
                break;
            }
            indice++;
        }
        
        clientes.remove(indice);
        Collections.sort(clientes);

        return true;
    }

}
