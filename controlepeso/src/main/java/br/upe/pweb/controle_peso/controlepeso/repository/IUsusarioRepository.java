package br.upe.pweb.controle_peso.controlepeso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.upe.pweb.controle_peso.controlepeso.models.Usuario;

@Repository
public interface IUsusarioRepository extends JpaRepository<Usuario, Long> {
    
    public Usuario findByEmail(String email);
}
