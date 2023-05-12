package pro.sky.SpringStore.service;

import org.springframework.stereotype.Service;
import pro.sky.SpringStore.model.Cart;

import java.util.List;

@Service
public class StoreServise {
    private final Cart cart;

    private StoreServise(Cart cart) {
        this.cart = cart;
    }

    private void addAll(List<Integer> values) {

        cart.addAll(values);
    }
    public List<Integer>getAll(){
        return cart.getAll();
    }
}

