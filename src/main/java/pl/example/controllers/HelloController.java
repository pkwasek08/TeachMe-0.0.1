package pl.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.example.repository.UserRepository;

@Controller
public class HelloController {

    UserRepository userRepository;

    @Autowired
    public HelloController(UserRepository userRepository) {
      this.userRepository=userRepository;
    }

    @RequestMapping("/")
    @ResponseBody
    public String sayHI(Model model1)
    {
        model1.addAttribute("user", userRepository.findAll());
        return "Hi";
    }

    @GetMapping("hi")
    public String hello(Model model1) {
        model1.addAttribute("user", userRepository.findAll());
        return "hello";
    }
}
