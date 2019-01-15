package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaculatorController {
    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @PostMapping("/calculator")
    public ModelAndView calculator(@RequestParam("firstOperand") double firstOperand, @RequestParam("secondOperand") double secondOperand, @RequestParam("operator") char operator) {
        ModelAndView modelAndView = new ModelAndView("index");
        double result;
        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else
                    throw new RuntimeException("Can't divide by zero");
            default:
                throw new RuntimeException("Invalid operation");
        }
        modelAndView.addObject("result", result);
        return modelAndView;
    }

    @GetMapping("/calculator")
    public ModelAndView view() {
        return new ModelAndView("index");
    }
}
