package pro.sky.SpringStore.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;
@Component
@Scope("prototype")
public class Cart {
    private List<Integer> cart = new ArrayList<>();
    public void addAll(List<Integer> values) {
        cart.addAll(values);
    }
    public List<Integer> getAll() {
        return cart;
    }

}
