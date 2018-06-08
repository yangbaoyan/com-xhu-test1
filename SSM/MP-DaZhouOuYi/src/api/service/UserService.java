package api.service;

import java.util.List;

import api.entity.Banner;
import api.entity.User;

public interface UserService {
    public User getUserById(Integer id);
    public List<User> getUserList();
}
