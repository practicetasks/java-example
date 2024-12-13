package task_tracker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class TaskManager {
    private HashMap<Integer, Task> tasks;
    private HashMap<Integer, Epic> epics;
    private HashMap<Integer, Subtask> subtasks;

    private int uniqueId = 1;

    // Создание (поступает задача без идентификатора)
    public void createTask(Task task) {
        task.setId(getUniqueId()); // присваиваем id
        tasks.put(task.getId(), task); // добавляем в хэш-таблицу
    }

    // Получение по идентификатору.
    public Task getTaskById(int id) {
        return tasks.get(id);
    }

    // Получение списка всех задач.
    public ArrayList<Task> getTasks() {
        return new ArrayList<>(tasks.values());
    }

    // Удаление всех задач.
    public void clearTasks() {
        tasks.clear();
    }

    // Обновление. Новая версия объекта с верным идентификатором передаётся в виде параметра.
    public void updateTask(int taskId, Task task) {
        tasks.put(taskId, task);
    }

    // Удаление по идентификатору.
    public void removeTaskById(int taskId) {
        tasks.remove(taskId);
    }

    public void createEpic(Epic epic) {
        // TODO
    }

    public Epic getEpicById(int epicId) {
        // TODO
    }

    public ArrayList<Epic> getEpics() {
        // TODO
    }

    public void clearEpics() {
        // TODO
    }

    public void updateEpic(int epicId, Epic epic) {
        // TODO
    }

    public void removeEpicById(int epicId) {
        // TODO
    }


    public void createSubtask(Subtask subtask) {
        // TODO
        //  - необходимо проверить, существует ли эпик с таким идентификатором
        //    если нет, не сохраняем
        Epic epic = subtask.getEpic();
        if (/*если существует эпик с таким id*/) {
            // subtasks.put(...)
            epic.addSubtask(subtask);
        }
    }

    public Subtask getSubtaskById(int subtaskId) {
        // TODO аналогично
    }

    public ArrayList<Subtask> getSubtasks() {
        // TODO аналогично
    }

    public void clearSubtasks() {
        // TODO аналогично
    }

    public void updateSubtask(int subtaskId, Subtask subtask) {
        // TODO аналогично
    }

    public void removeSubtaskById(int subtaskId) {
        // TODO если подзадача существует, необходимо удалить из subtasks
        //   также необходимо удалить из списка подзадач эпика
    }

    private int getUniqueId() {
        return uniqueId++;
    }
}
