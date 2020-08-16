package com.driverhelp.Service;

import com.driverhelp.Entity.UserDetails;
import com.driverhelp.Repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserDetailsService {
    @Autowired
    private UserDetailsRepository userDetailsRepository;

    public UserDetails addUser(UserDetails userDetails)

    {
        return userDetailsRepository.save(userDetails);
    }

    public List<UserDetails> getAllUsers()
    {
        List<UserDetails> userList=userDetailsRepository.findAll();
        return userList;
    }
}
