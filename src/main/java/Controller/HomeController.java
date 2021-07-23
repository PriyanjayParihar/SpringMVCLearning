package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("home")
    public String hello(){
        return "index";
    }
    @RequestMapping("/about")
    public String about(){
        return "about";
    }
    @RequestMapping("welcome")
    public String welcome(Model model){
        System.out.println("welcome controller");
        String name="ravi";
        model.addAttribute("name",name);
        return  "welcome";
    }
//     data sending to view by model obj
// By ModelAndView
    @RequestMapping("/ready")
    public ModelAndView ready(){
        ModelAndView m= new ModelAndView();
        m.setViewName("ready");
        List<String> friends=new ArrayList<>();
        friends.add("ravi");
        friends.add("rahul");
        friends.add("ranii");


        m.addObject("friends",friends );
        m.addObject("name","raj");
        return m;
    }
}
