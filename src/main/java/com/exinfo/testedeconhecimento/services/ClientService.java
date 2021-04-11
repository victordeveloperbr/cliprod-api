package com.exinfo.testedeconhecimento.services;

import com.exinfo.testedeconhecimento.domain.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAllClient();
    void save(Client client);
}
