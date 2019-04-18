package pl.com.project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.com.project.Notices.NoteRepository;
import pl.com.project.Users.PeopleRepository;

@Controller
public class HelloController {

    PeopleRepository peopleRepository;
    NoteRepository noticeRepository;

    @Autowired
    public HelloController(PeopleRepository peopleRepository, NoteRepository noticeRepository) {
        this.peopleRepository = peopleRepository;
        this.noticeRepository = noticeRepository;
    }

    @RequestMapping("/")
    @ResponseBody
    public String hello1(Model model1,Model model2) {
        model1.addAttribute("people",peopleRepository.findAll());
        model2.addAttribute("notenote",noticeRepository.findAll());
        return "hello TeachMe Demo";
    }

   /* @RequestMapping("/loggeduser")
    @ResponseBody
    public String loggedUserAction() {
        return "Hello User 1234";
    }*/

    @GetMapping("hi")
    public String hello(Model model1,Model model2) {
        model1.addAttribute("people",peopleRepository.findAll());
        model2.addAttribute("notenote",noticeRepository.findAll());
        return "hello";
    }

 /*   @RequestMapping("./note")
    @ResponseBody
    public String hello2(Model model2) {
        model2.addAttribute("note",noticeRepository.findAll());
        // model.addAttribute("id",peopleRepository.findAll());
        return "hello2";
    }*/

}