package xyz.karchinn79.tasktrackerSpring.Controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ErrorControl implements ErrorController {

    @RequestMapping("/error")
    public String getErrorPage(){
        return "eror";
    }


}