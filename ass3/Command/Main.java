package Command;

// В этом классе создаются команды и пульт, и всё это дело запускается
public class Main {
    public static void main(String[] args) {
        Television myTv = new Television();
        RemoteControl remote = new RemoteControl();

        // Создаем команду для включения
        Command turnOn = new TurnOnCommand(myTv);

        // Настраиваем пульт
        remote.setCommand(0, turnOn);

        // Жмем кнопку для включения телека
        remote.pressButton(0);
    }
}
