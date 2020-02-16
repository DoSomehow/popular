package org.ms.shiro.mapper;

import org.ms.shiro.domain.User;
import org.springframework.stereotype.Component;

// @Mapper
@Component
public interface UserMapper {

    public User findByName(String name);

    public User findById(Integer id);

}
