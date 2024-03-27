package ru.georgdeveloper.test_work_1.services;

import org.springframework.stereotype.Service;

// Сервис расчета отпускных
@Service
public class VacationСompensation implements CalculationVacationPaymentsService {

    //Расчет отпускных
    @Override
    public double calculateCompensation(double averageSalary, int vacationDays) {

        int year = 365;

        double compensation = (averageSalary / year) * vacationDays;
        return compensation;
    }
}
