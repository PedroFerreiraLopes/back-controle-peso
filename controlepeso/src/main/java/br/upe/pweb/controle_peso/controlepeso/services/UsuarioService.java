package br.upe.pweb.controle_peso.controlepeso.services;

import java.util.*;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import br.upe.pweb.controle_peso.controlepeso.models.Usuario;
import br.upe.pweb.controle_peso.controlepeso.repository.IUsusarioRepository;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    private IUsusarioRepository ususarioRepo;

    public List<Usuario> getUsuarios() {return ususarioRepo.findAll();}
    
    @Transactional(readOnly = false)
    public Usuario save(Usuario usuario) {
        if (usuario == null) {
            throw new RuntimeException("Usuário não pode ser nulo");
        }
        usuario.setId(null);

        if (StringUtils.hasLength(usuario.getNome()) || 
        StringUtils.hasLength(usuario.getEmail()) || 
        usuario.getAltura() <= 0 ||
        usuario.getDataFinal() == null ||
        usuario.getPesoInicial() <=0 ||
        usuario.getPesoFinal() <= 0 ||
        usuario.getGenero() == null) {

        }
        usuario.setDataInicial(LocalDate.now());
        return ususarioRepo.save(usuario);
    }

    public Usuario getUsuario(Long id) {
        return ususarioRepo.findById(id).get();
    }

    public void delete(Long id) {
        ususarioRepo.deleteById(id);
    }

    public Usuario update(Long id, Usuario usuario) {
        Usuario usuarioAtual = ususarioRepo.findById(id).get();
        usuarioAtual.setAltura(usuario.getAltura());
        usuarioAtual.setDataFinal(usuario.getDataFinal());
        usuarioAtual.setDataInicial(usuario.getDataInicial());
        usuarioAtual.setAltura(usuario.getAltura());
        usuarioAtual.setAltura(usuario.getAltura());
        usuarioAtual.setAltura(usuario.getAltura());
        return ususarioRepo.save(usuarioAtual);
    }
}
