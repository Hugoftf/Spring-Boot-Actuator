package com.github.Hugoftf.Spring.JPA.service;

import com.github.Hugoftf.Spring.JPA.model.Client;
import com.github.Hugoftf.Spring.JPA.repository.ClientRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;
    private final PasswordEncoder passwordEncoder;

    public ClientService(ClientRepository clientRepository,
                         PasswordEncoder passwordEncoder) {
        this.clientRepository = clientRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Client salvar(Client client){
        var senha = passwordEncoder.encode(client.getClientSecret());
        client.setClientSecret(senha);
        return clientRepository.save(client);
    }

    public Client obterPorClientID(String clientId){
        return clientRepository.findByClientId(clientId);
    }
}
