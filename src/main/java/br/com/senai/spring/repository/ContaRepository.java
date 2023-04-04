package br.com.senai.spring.repository;

import br.com.senai.spring.model.Conta;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContaRepository {
    private static List<Conta> contaList = new ArrayList<>();

    public List<Conta> getContas() {
        return contaList;
    }

    public Conta getContaById(Integer id) {
        return contaList.get(id);
    }

    public boolean createConta(Conta conta) {
        return contaList.add(conta);
    }

    public boolean deleteContaById(Integer id) {
        return contaList.remove(getContaById(id));
    }

    public void updateContaById(Integer id, Conta conta) {
        contaList.add(id, conta);
    }

}
