package pl.lublin.wsei.java.cwiczenia;
/* Bartłomiej Burek */
/* Numer albumu 37094 */

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("bartłomiej burek");
        System.out.println(acc.getName());
        System.out.println(acc.translit("Мірослав Бжечищикович"));
        System.out.println(acc.translit("Збігнєв Влодарський"));
        System.out.println(acc.translit("Анджей Дуда"));

    }
}
