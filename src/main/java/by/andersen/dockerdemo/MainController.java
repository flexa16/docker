package by.andersen.dockerdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class MainController {


    @GetMapping
    public ModelAndView show() {
        ModelAndView view = new ModelAndView();
        view.setViewName("index.html");
        return view;
    }
}
