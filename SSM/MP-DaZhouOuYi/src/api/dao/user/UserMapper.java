package api.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import api.entity.Banner;
import api.entity.User;

public interface UserMapper {
    public User getUserById(@Param("id")Integer id);
    public List<User> getUserList();
}
