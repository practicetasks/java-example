package task_tracker;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task task1 = new Task("задача 1", "описание 1");
        manager.createTask(task1);
        task1.setStatus("IN_PROGRESS");
        manager.updateTask(, task1);
        System.out.println(task1.getId()); // у задачи должен быть уникальный id

        Epic epic = new Epic("эпик 1", "описание 1");
        manager.createEpic(epic);
        System.out.println(epic.getId()); //

        Subtask subtask = new Subtask("подзадача 1", "описание 1", epic);
        manager.createSubtask(subtask);
        System.out.println(subtask.getId());

        System.out.println(manager.getTaskById(1)); //
        System.out.println(manager.getEpicById(2));
        System.out.println(manager.getSubtaskById(3));

    }
}
