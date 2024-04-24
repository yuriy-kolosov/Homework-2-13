package pro.sky.homework213.service;

import org.springframework.stereotype.Service;
import pro.sky.homework213.exception.DividingByZero;

@Service
public class CalcServiceImpl implements CalcService {

    public String welcome() {
        return "Добро пожаловать в калькулятор. Введите тип операции (plus|minus|multiply|divide) и два операнда";
    }

    public String add(String num1, String num2) {
        String res = "Ошибка: нет операнда";
        if (!num1.isEmpty() && !num2.isEmpty()) {
            res = num1 + " + " + num2 + " = " + (Integer.decode(num1) + Integer.decode(num2));
        }
        return res;
    }

    public String minus(String num1, String num2) {
        String res = "Ошибка: нет операнда";
        if (!num1.isEmpty() && !num2.isEmpty()) {
            res = num1 + " - " + num2 + " = " + (Integer.decode(num1) - Integer.decode(num2));
        }
        return res;
    }

    public String multiply(String num1, String num2) {
        String res = "Ошибка: нет операнда";
        if (!num1.isEmpty() && !num2.isEmpty()) {
            res = num1 + " * " + num2 + " = " + (Integer.decode(num1) * Integer.decode(num2));
        }
        return res;
    }

    public String divideShell(String num1, String num2) {
        try {
            return divide(num1, num2);
        } catch (DividingByZero r) {
            return r.toString();
        }
    }

    public String divide(String num1, String num2) {
        String res = "Ошибка: нет операнда";

        if (!num1.isEmpty() && !num2.isEmpty()) {

            if (Integer.decode(num2) == 0) {
                res = "Ошибка: деление на ноль запрещено";
                throw new DividingByZero(res);
            } else {
                res = num1 + " / " + num2 + " = " + ((double) Integer.decode(num1) / (double) Integer.decode(num2));
            }
        }
        return res;
    }

}
