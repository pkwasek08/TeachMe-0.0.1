package pl.com.project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.com.project.Notices.NoticeRepository;
import pl.com.project.Users.PeopleRepository;

@Controller
public class HelloController {

    PeopleRepository peopleRepository;
    NoticeRepository noticeRepository;

    @Autowired
    public HelloController(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }
    public HelloController(NoticeRepository noticeRepository) {
        this.noticeRepository = noticeRepository;
    }

    @RequestMapping("/")
    @ResponseBody
    public String hello1(Model model) {
        model.addAttribute("people",peopleRepository.findAll());
        model.addAttribute("note",noticeRepository.findAll());
        return "hello123456656456";
    }

   /* @RequestMapping("/loggeduser")
    @ResponseBody
    public String loggedUserAction() {
        return "Hello User 1234";
    }*/

    @GetMapping("hi")
    public String hello(Model model) {
        model.addAttribute("people",peopleRepository.findAll());
        model.addAttribute("note",noticeRepository.findAll());
       // model.addAttribute("id",peopleRepository.findAll());
        return "hello1";
    }

    @GetMapping("note")
    public String hello2(Model model) {
        model.addAttribute("note",noticeRepository.findAll());
        // model.addAttribute("id",peopleRepository.findAll());
        return "hello2";
    }


}
