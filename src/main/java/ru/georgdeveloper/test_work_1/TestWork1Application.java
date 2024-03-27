package ru.georgdeveloper.test_work_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Приложение "Калькулятор отпускных".
 * Микросервис на SpringBoot + Java 11 c одним API:
 * GET "/calculacte"
 *
 * Минимальные требования: Приложение принимает твою среднюю зарплату за 12 месяцев и количество дней
 * отпуска - отвечает суммой отпускных, которые придут сотруднику.
 * Доп. задание: При запросе также можно указать точные дни ухода в отпуск, тогда должен проводиться
 * рассчет отпускных с учётом праздников и выходных.
 *
 * Проверяться будет чистота кода, структура проекта, название полей\классов, правильность использования
 * паттернов. Желательно написание юнит-тестов, проверяющих расчет.
 */
@SpringBootApplication
public class TestWork1Application {

    public static void main(String[] args) {
        SpringApplication.run(TestWork1Application.class, args);
    }

}
