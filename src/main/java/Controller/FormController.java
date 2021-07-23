package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @RequestMapping("contact")
    public String getForm(){
        return "contact";
    }
    @RequestMapping("processForm")
    public String processForm(@RequestParam("name") String name, @RequestParam("number") String number, @RequestParam("age") int age , Model model){
        model.addAttribute("name", name);
        model.addAttribute("number",number);
        model.addAttribute("age",age);
        return "hello";
    }
}
