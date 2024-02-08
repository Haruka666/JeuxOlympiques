package com.example.JeuxOlympiques.users;

import com.example.JeuxOlympiques.event.Events;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private UsersRepository usersRepository;
    @Autowired
    public UsersService (UsersRepository usersRepository) { this.usersRepository = usersRepository;}
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }
        public Users getUsersById(Integer id) {
            return usersRepository.findById(id).orElse(null);
        }
        public Users createUsers(Users users) {
            return usersRepository.save(users);
        }

    public Users createUsers(Users users) {
        return usersRepository.save(users);
    }

    public Users getUsersById(Long id) {
        return usersRepository.findById(id).orElse(null);
    }


}
