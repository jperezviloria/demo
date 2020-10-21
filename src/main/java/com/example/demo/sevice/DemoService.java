package com.example.demo.sevice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {

    public List<Integer> getNumber(){
        List<Integer> miLista = new ArrayList<Integer>();
        miLista.add(3);
        miLista.add(1);
        miLista.add(4);
        return miLista;
    }

}
