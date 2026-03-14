package practice_7.additional_tasks;

public class MainForVisitor {
    public static void main(String[] args) {
        ActionsOfVisitor av = new ActionsOfVisitor();
        av.doAction("Открытие диалога");
        av.doAction("Написание сообщения");
        av.doAction("Отправка сообщения");
        av.doAction("Изменение сообщения");
        av.printAllActions();
        av.undoAction();
        av.undoAction();
        av.printAllActions();


    }
}
