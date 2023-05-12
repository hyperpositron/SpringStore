package pro.sky.SpringStore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.SpringStore.service.StoreServise;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreServise service;

    public StoreController(StoreServise service) {
        this.service = service;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в магазин!";
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> values) {
        service.addAll(values);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return service.getAll();
    }
}
