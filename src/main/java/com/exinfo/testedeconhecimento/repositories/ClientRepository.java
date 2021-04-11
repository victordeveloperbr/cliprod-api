package com.exinfo.testedeconhecimento.repositories;

import com.exinfo.testedeconhecimento.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ClientRepository extends JpaRepository<Client, BigInteger> {
}
