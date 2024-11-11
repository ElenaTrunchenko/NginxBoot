package ru.netology.nginxboot.repository;

import org.springframework.stereotype.Repository;
import ru.netology.nginxboot.model.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("admin") && password.equals("12345")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("user") && password.equals("123")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        }
        return authorities;
    }
}
