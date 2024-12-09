package com.yevhen.GoogleOauth2Login.repo;


import com.yevhen.GoogleOauth2Login.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername (String userName);

}