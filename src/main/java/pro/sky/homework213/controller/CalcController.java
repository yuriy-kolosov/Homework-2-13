package pro.sky.homework213.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework213.service.CalcService;

@RestController
@RequestMapping(path = "/calculator")
public class CalcController {
//                                      Домашнее задание 2-13. Тестирование

    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String welcomeCalc() {
        return calcService.welcome();
    }

    @GetMapping(path = "/plus")
    public String addCalc(@RequestParam("num1") String op1Name,
                          @RequestParam("num2") String op2Name) {
        return calcService.add(op1Name, op2Name);
    }

    @GetMapping(path = "/minus")
    public String minusCalc(@RequestParam("num1") String op1Name,
                            @RequestParam("num2") String op2Name) {
        return calcService.minus(op1Name, op2Name);
    }

    @GetMapping(path = "/multiply")
    public String multiplyCalc(@RequestParam("num1") String op1Name,
                               @RequestParam("num2") String op2Name) {
        return calcService.multiply(op1Name, op2Name);
    }

    @GetMapping(path = "/divide")
    public String divideCalc(@RequestParam("num1") String op1Name,
                             @RequestParam("num2") String op2Name) {
        return calcService.divideShell(op1Name, op2Name);
    }

}
