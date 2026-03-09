package controller;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    List<Usuario> listaUsuarios;
    Operaciones operaciones;

    public Agenda() {
        listaUsuarios = new ArrayList<>();
        operaciones = new Operaciones();
    }

    public void agregarUsuario(Usuario usuario) {
        this.listaUsuarios.add(usuario);
    }

    public void exportarUsuarios(){
        listaUsuarios.forEach(usuarios->operaciones.exportarUsuario(usuarios));
    }

    public void listarUsuarios(){
        listaUsuarios.forEach(Usuario::mostrarDatos);
    }
}
