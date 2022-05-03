package xyz.karchinn79.tasktrackerSpring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.view.RedirectView;
import xyz.karchinn79.tasktrackerSpring.service.TaskServ;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    TaskServ taskService;


}
