package br.com.bruno.my_first_web_api.repository;

import br.com.bruno.my_first_web_api.handler.BusinessException;
import br.com.bruno.my_first_web_api.handler.RequiredFieldException;
import br.com.bruno.my_first_web_api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user) {
        if (user.getLogin() == null) {
            throw new RequiredFieldException("login");
        }
        if (user.getPassword() == null) {
            throw new RequiredFieldException("password");
        }
        if (user.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }

        System.out.println(user);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/ID - Recebendo o id: %d para excluir um registo na camada de repositório", id));
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("LIST - Listando os usuário do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Bruno", "123"));
        users.add(new User(2, "Maria", "456"));

        return users;
    }

    public User findById(Integer id) {
        System.out.println(String.format("FIND/ID - Recebendo o id: %d para buscar um registo na camada de repositório", id));
        return new User(id, "Bruno", "123");
    }

    public User findByUsername(String username) {
        System.out.println(String.format("FIND/USERNAME - Recebendo o username: %s para buscar um registo na camada de repositório", username));
        return new User(1, "Bruno", "123");
    }
}
