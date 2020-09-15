package pe.pucp.edu.telecom.manager;

import com.company.Usuario;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


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

        List<String[]> paises = new ArrayList<String[]>;
        paises.add(new String[]{"Afghanistan", "AF", "AFG", "4", "Yes"});
        paises.add(new String[]{"Spain", "ES", "ESP", "724", "Yes"});


        String archCSV = "/doc/Directorio.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(archCSV));

        writer.writeAll(paises);

        writer.close();





    }
}
