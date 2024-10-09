package Command;

// А это пульт. На него вешаешь команды и жмёшь кнопки
class RemoteControl {
    private Command[] buttons = new Command[6]; // Кнопок 6 штук

    // Метод для настройки команды на конкретную кнопку
    public void setCommand(int slot, Command command) {
        buttons[slot] = command;
    }

    // Когда нажимаешь кнопку — выполняется команда
    public void pressButton(int slot) {
        buttons[slot].execute();
    }
}
