package com.exinfo.testedeconhecimento.services.impl;

import com.exinfo.testedeconhecimento.domain.Client;
import com.exinfo.testedeconhecimento.repositories.ClientRepository;
import com.exinfo.testedeconhecimento.services.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository)
    {
        this.clientRepository = clientRepository;
    }

    /// este método vai retornar todos os clientes armazenados no banco de dados e na tabela cliente.
    @Override
    public List<Client> getAllClient() {
        List<Client> client = this.clientRepository.findAll();
        return client;
    }
    //esta função salva os dados do cliente no banco de dados;
    //it can save into database client itself.
    @Override
    public void save(Client client) {
        this.clientRepository.save(client);
    }

}
