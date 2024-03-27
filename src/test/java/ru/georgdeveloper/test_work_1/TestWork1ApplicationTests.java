package ru.georgdeveloper.test_work_1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.georgdeveloper.test_work_1.services.CalculationVacationPaymentsService;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class TestWork1ApplicationTests {

    //Тест расчета отпускных

    @Autowired
    private CalculationVacationPaymentsService calculationVacationPaymentsService;

    @Test
    void contextLoads() {
        double averageSalary = 60000.0; // Средняя зарплата за 12 месяцев
        int vacationDays = 20; // Количество дней отпуска
        double expectedCompensation = (60000.0 / 365) * 20; // Ожидаемая сумма отпускных
        System.out.println(expectedCompensation);

        assertEquals(expectedCompensation,calculationVacationPaymentsService.calculateCompensation(averageSalary, vacationDays));
    }

}
