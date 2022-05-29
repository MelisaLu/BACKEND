package com.portfoliomlh.MLH.service;

import com.portfoliomlh.MLH.model.UserDto;
import com.portfoliomlh.MLH.model.Usuario;
import com.portfoliomlh.MLH.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AuthService {

    @Autowired
    AuthRepository repository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public boolean isUserEnabled (UserDto userDto){
        boolean isUserEnabled = false;
        List<Usuario> usuarios = repository.findByEmailAndIsEnabledTrue(userDto.getEmail());
        if (!usuarios.isEmpty()){
            Usuario usuario= usuarios.get(0);
            if (passwordEncoder.matches(userDto.getPassword(), usuario.getPassword()))
                isUserEnabled = true;
        }
        return isUserEnabled;
    }

    public void crearUsuario(Usuario usuario) throws Exception {
        List<Usuario> usuarios = repository.findByEmailAndIsEnabledTrue(usuario.getEmail());
        if (!usuarios.isEmpty()){
            throw new Exception("El email ya esta registrado.");
        }else {
            usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
            usuario.setEnabled(true);
            repository.save(usuario);
        }
    }

}
