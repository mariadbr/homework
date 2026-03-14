package practice_7.additional_tasks;

import java.util.ArrayDeque;

public class ActionsOfVisitor {
    //5 История действий пользователя
    private ArrayDeque<String> actions;

    public ActionsOfVisitor() {
        actions = new ArrayDeque<>();
    }

    public void doAction(String action) {
        actions.push(action);
    }

    public void undoAction() {
        actions.pop();
    }

    public void printAllActions() {
        actions.forEach(System.out::println);
        System.out.println();
    }




}
