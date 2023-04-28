package servicios;

import java.util.ArrayList;
import java.util.Collections;
import modelos.Cliente;
import modelos.Producto;

public class ProductosServicio {

    public ArrayList<Producto> productos;

    public ProductosServicio() {
        productos = new ArrayList<>();

        Producto p1 = new Producto(
                1,
                "semitas",
                5,
                25,
                15
        );
        Producto p2 = new Producto(
                2,
                "Cafe",
                2,
                130,
                15
        );

        productos.add(p1);
        productos.add(p2);
    }

    public final String[] colunmasNombres
            = {
                "Id",
                "Nombre",
                "Stock",
                "Precio",
                "Total",
                "Iva",
                "Precio de Venta"
            };

    public ArrayList<Producto> getProductos(String search) {

        int id;

        ArrayList<Producto> productosFiltrados = new ArrayList<>();

        if (search.isEmpty()) {
            return productos;
        } else {
            id = Integer.parseInt(search);

            for (Producto p : productos) {
                if (p.getId() == id) {
                    productosFiltrados.add(p);
                }
            }
        }
        return productosFiltrados;
    }

    public boolean add(Producto producto) {
        this.productos.add(producto);
        return true;
    }

    public boolean editar(Producto producto) {
        int indice = 0;

        for (Producto p : productos) {
            if (p.getId() == producto.getId()) {
                break;
            }
            indice++;
        }
        productos.remove(indice);
        productos.add(producto);
        return true;
    }

    public boolean borrar(int id) {
        int indice = 0;

        for (Producto p : productos) {
            if (p.getId() == id) {
                break;
            }
            indice++;
        }
        productos.remove(indice);
        Collections.sort(productos);
        return true;
    }

}
