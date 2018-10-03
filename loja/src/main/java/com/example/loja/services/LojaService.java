package com.example.loja.services;

import com.example.loja.models.Loja;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class LojaService {

    public ArrayList<Loja> pegaTodasLojas(){
        return geraLojas();
    }

    private ArrayList<Loja> geraLojas(){

        Loja loja = new Loja("Tumeleiro","Ipiranga",6900048);
        Loja loja2 = new Loja("Americanas","Ipiranga",6900048);

        ArrayList<Loja> lojas = new ArrayList<>(Arrays.asList(loja, loja2));

        return lojas;
    }
}
