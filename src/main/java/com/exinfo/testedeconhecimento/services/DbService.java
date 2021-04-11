package com.exinfo.testedeconhecimento.services;

import com.exinfo.testedeconhecimento.domain.Client;
import com.exinfo.testedeconhecimento.domain.Product;
import com.exinfo.testedeconhecimento.repositories.ClientRepository;
import com.exinfo.testedeconhecimento.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Arrays;

@Service
public class DbService {

    private final ClientRepository clientRepository;
    private final ProductRepository productRepository;


    public DbService(ClientRepository clientRepository, ProductRepository productRepository) {
        this.clientRepository = clientRepository;
        this.productRepository = productRepository;
    }

    public void iniciarConstrucaoDB() throws ParseException
    {
        // client
        Client cli1 = new Client(null, "Jorge Gomes Costa", "Rua Tupinabar, 234");
        Client cli2 = new Client(null, "Clementina Maria Barbosa", "Rua Brasil, 134");
        Client cli3 = new Client(null, "Clodoviu Alves Maia Lima", "Rua Pedro Alvares Cabral, 890");

        clientRepository.saveAll(Arrays.asList(cli1, cli2, cli3));

        // produto
        Product pro1 = new Product(null, "Notebook Intel i7", "7780k 15 pol", 1234.90);
        Product pro2 = new Product(null, "Monitor LCD", "22 pol", 800.00);

        productRepository.saveAll(Arrays.asList(pro1, pro2));
    }


}
