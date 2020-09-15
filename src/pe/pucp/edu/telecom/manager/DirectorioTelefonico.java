package pe.pucp.edu.telecom.manager;

import com.company.Usuario;

import java.util.ArrayList;


public class DirectorioTelefonico {

    public void anhadirUsuarioAlaLista(Usuario usuario){

       /* prueba mover */ ArrayList<Usuario> listaUsuario = new ArrayList<>();
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
