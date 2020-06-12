package ziihh.jspPractice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ziihh.jspPractice.Entity.User;
import ziihh.jspPractice.Service.IndexService;

import java.awt.*;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    IndexService indexService;

    @RequestMapping( value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping( value = "/redirect", method = RequestMethod.GET)
    public String redirectWelcome(){
        return "redirect:welcome";
    }

    @PostMapping(value = "/index")
    @ResponseBody
    public String createUser(ModelMap model, User user){
        System.out.print(user);
        boolean isValidUser = indexService.insertUser(user);

        if(!isValidUser){
            model.put("errorMessage", "fill all fields");
            return "index";
        }
            model.put("name", user.getEmail());
        return "welcome";
    }

   /* @GetMapping(value = "index", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<User> getAllUser(){
        return indexService.showAllUsers();
    }*/


}
