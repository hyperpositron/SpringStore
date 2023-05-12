package pro.sky.SpringStore.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.ArrayList;
@Component
@SessionScope //пока не разорвано соединение с браузером ,он этот объект будет сохранять, для каждой сессии своя тележка
//@Scope("prototype") // одна тележка для всех сесии
public class Cart {
    private List<Integer> cart = new ArrayList<>();
    public void addAll(List<Integer> values) {
        cart.addAll(values);
    }
    public List<Integer> getAll() {
        return cart;
    }

}
