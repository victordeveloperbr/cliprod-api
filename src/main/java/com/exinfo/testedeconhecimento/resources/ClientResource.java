package com.exinfo.testedeconhecimento.resources;

import com.exinfo.testedeconhecimento.domain.Client;
import com.exinfo.testedeconhecimento.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@CrossOrigin
public class ClientResource {
    private final ClientService clientService;


    public ClientResource(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getAll(){
        List<Client> clients = this.clientService.getAllClient();
        return clients;
    }

    @PostMapping
    public Client saveIntoDb(@RequestBody Client client)
    {
        this.clientService.save(client);
        return client;
    }
}
