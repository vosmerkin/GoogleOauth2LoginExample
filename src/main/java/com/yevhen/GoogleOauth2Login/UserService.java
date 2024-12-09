package com.yevhen.GoogleOauth2Login;

import com.yevhen.GoogleOauth2Login.model.User;
import com.yevhen.GoogleOauth2Login.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService
{
    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username)
    {
        User userFindByUsername = userRepo.findByUsername(username);


        if(userFindByUsername != null)
        {
            return userFindByUsername;
        }

        return null;
    }
}
