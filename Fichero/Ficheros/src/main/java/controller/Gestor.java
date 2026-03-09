package controller;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Gestor {

    private List<Usuario> list;
    private Operaciones operaciones;

    public Gestor() {
        list = new ArrayList<>();
        operaciones = new Operaciones(); //juntamos los controladores
        //lista = operaciones.importarUsuario -> ejemplo de semi-persistencia
    }

    public void addUsuario(Usuario usuario) {
        this.list.add(usuario);
        System.out.println("usuario creado con exito");
    }

    public void exportar(){
        //list.forEach(System.out::println); //se hace un println del objeto
        list.forEach(p->operaciones.exportarUsuario(p)); // -> recorre el usuario y exporta el fichero que te estoy pidiendo
    }

    public void importar(){
        list = operaciones.importarUsuario();
    }

    public void listarUsuarios() {
        this.list.forEach(Usuario::mostrarDatos);
    }


    public List<Usuario> getList() {
        return list;
    }

    public void setList(List<Usuario> list) {
        this.list = list;
    }
}
