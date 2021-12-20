package сalculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
        /* Программа не работает потому что возникает ошибка ArithmeticException /by zero; в лямбду devide мы передаем в
        переменную 0, но на ноль делить нельзя, соответсвенно надо в лямде devide сделать тернарный оператор, который
        при делении на ноль будет возвращать 0;
         */
    }
}
