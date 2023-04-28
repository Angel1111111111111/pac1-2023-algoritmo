/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import modelos.Empresa;

/**
 *
 * @author angel
 */
public class EmpresaServicio {
    private ArrayList<Empresa> empresas;
    public final String[] colunmasNombres
            = {
                "Id",
                "Nombre",
                "Direccion",
                "Telefono",
                "Email"
            };
    public ArrayList<Empresa> getEmpresa(String search) {
        int id;
        ArrayList<Empresa> empresasFiltrados = new ArrayList<>();

        if (search.isEmpty()) {
            return empresas;
        } else {
            id = Integer.parseInt(search);
            for (Empresa empresa : empresas) {
                if (empresa.getId() == id) {
                    empresasFiltrados.add(empresa);
                }
            }
        }
        return empresasFiltrados;
    }
    public void setEmpresa(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public EmpresaServicio() {
        empresas = new ArrayList<>();
        Empresa e1 = new Empresa(
                1, 
                "Adidas", 
                "frenteati",
                "22665678",
                "Adidas@gmail.com");
        Empresa e2 = new Empresa(
                2, 
                "Nike", 
                "Bo.Santa Teresa",
                "22345678",
                "Nike@gmail.com");

        
        empresas.add(e1);
        empresas.add(e2);
    }
    public ArrayList<Empresa> verTodos() {
        return this.empresas;
    }

    public boolean agregar(Empresa empresa) {
        this.empresas.add(empresa);
        return true;
    }

    public boolean editar(Empresa empresa) {
        int indice = 0;
                
        for(Empresa e: this.empresas ){
            if(e.getId() == empresa.getId()){
                break;
            }
            indice++;
        }
        
        empresas.remove(indice);
        empresas.add(empresa);
        
        Collections.sort(empresas);
        return true;
    }

    public boolean borrar(int id) {
        int indice = 0;
                
        for(Empresa c: empresas ){
            if(c.getId() == id){
                break;
            }
            indice++;
        }
        
        empresas.remove(indice);
        Collections.sort(empresas);

        return true;
    }
}
