package Chain;

// Это основной класс, который собирает цепочку и пробует оплатить
public class Main {
    public static void main(String[] args) {
        PaymentHandler handlerA = new PayByA();
        PaymentHandler handlerB = new PayByB();
        PaymentHandler handlerC = new PayByC();

        // Устанавливаем цепочку: A -> B -> C
        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);

        // Пытаемся оплатить 210 монеток
        handlerA.handle(210); // Пройдет через B
    }
}

