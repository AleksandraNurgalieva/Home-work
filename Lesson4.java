public class Lesson4 {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иванов Николай Иванович", "Грузчик", "ivangruz@mail.ru", "1111", 1000, 18);
        employeesArray[1] = new Employee("Иванов Сергей Иванович", "Старший грузчик", "sergeysupergruz@mail.ru", "1200", 1200, 20);
        employeesArray[2] = new Employee("Иванов Юрий Иванович", "Начальник отдела погрузки", "yuriprofessional@mail.ru", "1010", 1500, 22);
        employeesArray[3] = new Employee("Иванов Иван Петрович", "Начальник склада", "nachsklad@mail.ru", "1001", 1700, 42);
        employeesArray[4] = new Employee("Иванов Петр Юрьевич", "Генеральный директор", "gendirpetya@mail.ru", "1000", 500000, 65);
        for (int i = 0; i < 5; i++) {
            System.out.println("---------------------");
            employeesArray[i].info();
        }
    }
}