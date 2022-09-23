package ai.makebot.shop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeleafExController {

    @GetMapping(value = "/ex")
    public String thymeleafexample() {
        return "thymeleafEx";
    }

}
