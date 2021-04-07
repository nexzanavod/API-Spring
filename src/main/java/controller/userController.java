package controller;

import model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.userRepository;

import java.util.List;

@RestController
@RequestMapping("api/")
public class userController {

    @Autowired

    private userRepository userRepository;

    @GetMapping("users")
    public List<user> getusers(){
        return this.userRepository.findAll();
    }
}
