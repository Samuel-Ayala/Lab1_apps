package pe.pucp.edu.telecom.manager;

import com.company.Usuario;

import java.util.ArrayList;

public class DirectorioTelefonico {
    ArrayList<Usuario> listaUsuario = new ArrayList<>();

    public void anhadirUsuarioAlaLista(Usuario usuario){


        Usuario usu = new Usuario();

        usu.setNombres(usuario.getNombres());
        usu.setApellido(usuario.getApellido());
        usu.setAnexo(usu.getAnexo());
        usu.setCodigo(usu.getCodigo());
        usu.setTelefono(usu.getTelefono());
        usu.setDepartamento(usu.getDepartamento());

        listaUsuario.add(usu);




    }
}
