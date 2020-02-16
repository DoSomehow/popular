package org.ms.shiro.service;

import org.ms.shiro.domain.User;

public interface UserService {

    public User findByName(String name);

    public User findById(Integer id);

}
