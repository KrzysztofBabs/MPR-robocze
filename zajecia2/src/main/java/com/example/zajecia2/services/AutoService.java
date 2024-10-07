package com.example.zajecia2.services;

import com.example.zajecia2.model.Auto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class AutoService {
    private List<Auto> autoList = new ArrayList<>();
    public AutoService() {
        autoList.add(new Auto("Dacia",2022));
        autoList.add(new Auto("Toyota",2023));
        autoList.add(new Auto("Audi",2024));
    }
    public List<Auto> getAll(){
        return this.autoList;
    }

    public void add(Auto auto){
        this.autoList.add(auto);
    }



}
