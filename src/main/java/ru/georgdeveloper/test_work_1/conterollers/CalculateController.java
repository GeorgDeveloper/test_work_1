package ru.georgdeveloper.test_work_1.conterollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.georgdeveloper.test_work_1.services.CalculationVacationPaymentsService;

@RestController
public class CalculateController {

    private final CalculationVacationPaymentsService calculationVacationPaymentsService;

    @Autowired
    public CalculateController(CalculationVacationPaymentsService calculationVacationPaymentsService) {
        this.calculationVacationPaymentsService = calculationVacationPaymentsService;
    }


    @GetMapping("/calculacte")
    public String calculateVacationCompensation(@RequestParam double averageSalary, @RequestParam int vacationDays) {
        double compensation = calculationVacationPaymentsService.calculateCompensation(averageSalary, vacationDays);
        return "" + compensation; // Вернуть результат
    }
}
