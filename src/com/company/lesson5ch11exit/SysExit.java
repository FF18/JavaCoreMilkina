package com.company.lesson5ch11exit;

public class SysExit {
    public static void main(String[] args) {
        System.out.println("До возврата ");
        method(true);
        System.out.println("этот оператор выполняться не будет ");
    }

    private static void method(boolean flag) {
        if (flag) {
            System.exit(0); //0 говорит о том, что программа завершилась корректно
        }
        System.out.println("этот оператор метода выполняться не будет ");
    }
}
// System.exit() применять  в крайнем случае. Лучше return, break или continue, если можно.