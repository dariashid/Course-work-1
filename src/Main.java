public class Main {
    static int counter = 0;
    public static void main(String[] args) {
        Employee[] employeeAray = new Employee[10];

        employeeAray[0] = new Employee("Иванова Елена Игоревна", 1, 40000, counter);

        employeeAray[1] = new Employee("Левин Сергей Павлович", 1, 40500, counter);

        employeeAray[2] = new Employee("Сонич Максим Гарикович", 2, 50000, counter);

        employeeAray[3] = new Employee("Корчагина Ирина Тимофеевна", 2, 50500, counter);

        employeeAray[4] = new Employee("Шамарданова Алёна Игоревна", 3, 60000, counter);

        employeeAray[5] = new Employee("Шпаков Иван Владимирович", 3, 60500, counter);

        employeeAray[6] = new Employee("Осипов Евгений Андреевич", 4, 70000, counter);

        employeeAray[7] = new Employee("Пономарева Варвара Львовна", 4, 70500, counter);

        employeeAray[8] = new Employee("Антонов Матвей Тимурович", 5, 80000, counter);

        employeeAray[9] = new Employee("Семенов Евгений Викторович", 5, 80500, counter);

//список всех сотрудников со всеми имеющимися по ним данными.
        for (int i = 0; i < employeeAray.length; i++) {
            System.out.println(employeeAray[i]);
        }

//сумма затрат на зарплаты в месяц.
        int sum = 0;
        for (Employee emp : employeeAray) {
            sum = sum + emp.getSalary();
        }
        System.out.println(sum);

//сотрудник с минимальной зарплатой.
        int salary = employeeAray[0].getSalary();
        Employee minimumSalary = employeeAray[0];
        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getSalary() < salary) {
                minimumSalary = employeeAray[i];
            }
        }
        System.out.println(minimumSalary);

//сотрудник с максимальной зарплатой.
        int salary1 = employeeAray[0].getSalary();
        Employee maximumSalary = employeeAray[0];
        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getSalary() > salary1) {
                maximumSalary = employeeAray[i];
            }
        }
        System.out.println(maximumSalary);

//среднее значение зарплат.
        int averageSalary = sum / employeeAray.length;
        System.out.println(averageSalary);

//Ф.И.О. всех сотрудников.
        for (int i = 0; i < employeeAray.length; i++) {
            System.out.println(employeeAray[i].getFullName());
        }

//ПОВЫШЕННАЯ СЛОЖНОСТЬ
//индексация зарплат сотрудников.
        int prc = 14;
        for (int i = 0; i < employeeAray.length; i++) {
            employeeAray[i].setSalary(employeeAray[i].getSalary() * (100 + prc) / 100);
            System.out.println(employeeAray[i]);
        }

//сотрудник с минимальной зарплатой.
        Employee minimumSalary1 = employeeAray[0];
        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getDepartmentName() == 1) {
                if (employeeAray[i].getSalary() < salary) {
                    minimumSalary1 = employeeAray[i];
                }
            }
        }
        System.out.println(minimumSalary1);

//сотрудник с максимальной зарплатой.
        Employee maximumSalary1 = employeeAray[0];
        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getDepartmentName() == 1) {
                if (employeeAray[i].getSalary() > salary) {
                    maximumSalary1 = employeeAray[i];
                }
            }
        }
        System.out.println(maximumSalary1);

//сумма затрат на зарплату в отделе
        int sum1 = 0;
        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getDepartmentName() == 4) {
                    sum1 = sum1 + employeeAray[i].getSalary();
            }
        }
        System.out.println(sum1);

//индексация зарплат сотрудников отдела.
        int prc1 = 50;
        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getDepartmentName() == 5) {
                employeeAray[i].setSalary(employeeAray[i].getSalary() * (100 + prc1) / 100);
                System.out.println(employeeAray[i]);
            }
        }
//список сотрудников отдела(фио, зп, id).
        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getDepartmentName() == 3) {
                System.out.println(employeeAray[i].getFullName() + " " + employeeAray[i].getSalary() + " " + employeeAray[i].getId());
            }
        }


        //список сотрудников с зарплатой меньше числа n.
        int n = 78999;
        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getSalary() < n) {
                System.out.println(employeeAray[i].getFullName() + " " + employeeAray[i].getSalary() + " " + employeeAray[i].getId());
            }
        }

//список сотрудников с зарплатой больше числа n.
        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getSalary() >= n ) {
                System.out.println(employeeAray[i].getFullName() + " " + employeeAray[i].getSalary() + " " + employeeAray[i].getId());
            }
        }
    }
    }

