package controller;

import model.EmailSetting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import serviece.MailServiece;

@Controller
public class MailController {
    MailServiece mailServiece = new MailServiece();
    @GetMapping("/")
    ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("/home");
        EmailSetting emailSetting = mailServiece.defaultSetting();
        modelAndView.addObject("email",emailSetting);
        return modelAndView;
    }
    @PostMapping("/submit")
    ModelAndView save(@ModelAttribute EmailSetting email){
        ModelAndView modelAndView = new ModelAndView("/home");
        EmailSetting emailSetting = mailServiece.save(email);
        modelAndView.addObject("email",emailSetting);
        return modelAndView;

    }

}
