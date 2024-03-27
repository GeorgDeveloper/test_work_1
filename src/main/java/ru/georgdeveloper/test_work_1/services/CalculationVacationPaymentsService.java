package ru.georgdeveloper.test_work_1.services;

// Интерфейс сервисов для расчета отпускных
public interface CalculationVacationPaymentsService {
    double calculateCompensation(double averageSalary, int vacationDays);
}
