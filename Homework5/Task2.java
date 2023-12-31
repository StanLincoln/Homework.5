package Homework5;

import java.util.Scanner;

//                Есть устройство,на табло которого показывается количество секунд,оставшихся до конца рабочего дня.
//                Когда рабочий день начинается ровно в 9часов утра — табло отображает «28800» (т.е.остаётся 8часов),
//                когда 14:30 — на табло «9000» (т.е.остаётся два с половиной часа),а когда наступает 17часов — на
//                табло отображается «0» (т.е.рабочий день закончился).
//                Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
//                Требуется написать программу,которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
//                сколько полных часов осталось до конца рабочего дня.
//                Например: «осталось 7часов», «осталось 4часа», «остался 1час», «осталось менее часа».
//                Объяснение:в переменную n должно записываться случайное(на время тестирования программы)целое число из
//                диапазона от 0до 28800,далее оно должно выводиться на экран(для тех,кто понимает в секундах)и
//                на следующей строке(для тех кто не понимает)должна выводиться фраза о количестве полных часов,
//                содержащихся в n секундах.
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите время в секундах: ");
        int sec = scanner.nextInt();
        int hoursLeft = sec / 3600;
        if (hoursLeft <= 8 && hoursLeft >= 5) System.out.println("Осталось " + hoursLeft + " часов");
        else if (hoursLeft <= 4 && hoursLeft >= 2) System.out.println("Осталось " + hoursLeft + " часа");
        else if(hoursLeft==1) System.out.println("Остался " + hoursLeft + " час");
        else System.out.println("Осталось менее часа");
    }
}

