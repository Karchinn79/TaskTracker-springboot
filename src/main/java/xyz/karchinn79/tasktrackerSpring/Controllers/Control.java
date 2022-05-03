package xyz.karchinn79.tasktrackerSpring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import xyz.karchinn79.tasktrackerSpring.entity.Task;
import xyz.karchinn79.tasktrackerSpring.service.TaskServ;

import java.time.LocalDate;

@Controller
public class Control {
    @Autowired
    TaskServ taskService;

    @RequestMapping("/")
    public String getMainPage(Model model){
        model.addAttribute("tasks", taskService.getAllTasks());
        return "index";
    }

//    @RequestMapping("/error")
//    public String getErrorPage(){
//        return "eror";
//    }

    @RequestMapping("/addTask")
    public String addTask(Model model){
    model.addAttribute("task", new Task());
    return "addTask";
    }

    @RequestMapping("/saveAction")
    public RedirectView addTask(@ModelAttribute("updatable") Task task){
        System.out.println(task.getId()  + " ]]]ГОБХААААААААААААААА");
        task.setDate(LocalDate.now());
        taskService.addTask(task);
        return new RedirectView("/");
    }
    @RequestMapping("/delete/start")
    public String backTo(){
        return "/";
    }

    @RequestMapping("/update/{id}")
    public String updateElem(Model model, @PathVariable("id") int id){
        model.addAttribute("updatable", taskService.getTaskById(id));
        return "updateTask";
    }
    @RequestMapping(method = RequestMethod.DELETE, value= "/delete/{id}")
    public String deleteElem(@PathVariable("id") int id){
        taskService.deleteTask(id);
        return "redirect:/";
    }
//    model.addAttribute("task", new Task());
}
