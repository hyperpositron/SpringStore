package pro.sky.SpringStore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.SpringStore.service.StoreServise;

@RestController
public class StoreController {
    private final StoreServise service;
    public  StoreController(StoreServise service){
        this.service= service;
    }
    @GetMapping
    public String welcome(){
        return "Добро пожаловать в магазин!";
    }
}
