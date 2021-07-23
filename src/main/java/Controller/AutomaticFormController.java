package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;

@Controller
public class AutomaticFormController {
    @RequestMapping("info")
    public  String showForm(){
        return "infoForm";

    }
    @RequestMapping("processAutomaticForm")
    public String processForm(@ModelAttribute User user , Model model){
        //all task done automatic by this annotation
        System.out.println(user);
        return "showInfo";
    }

}
