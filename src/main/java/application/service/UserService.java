package application.service;

import application.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
