package br.com.senai.spring.service;

import br.com.senai.spring.model.Cliente;
import br.com.senai.spring.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public boolean createClient(Cliente cliente) {
        return repository.createClient(cliente);
    }

    public List<Cliente> getClients() {
        return repository.getClients();
    }

    public Cliente getClientById(Integer id) {
        return repository.getClientById(id);
    }

    public boolean deleteClientById(Integer id) {
        return repository.deleteClientById(id);
    }

    public void updateClientById(Integer id, Cliente cliente) {
        repository.updateClientById(id, cliente);
    }

}
