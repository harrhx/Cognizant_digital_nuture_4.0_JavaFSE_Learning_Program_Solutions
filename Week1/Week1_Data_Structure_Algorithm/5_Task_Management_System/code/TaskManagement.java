class Task {
    String taskId;
    String taskName;
    String status;

    public Task(String taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    public String getTaskId() {
        return taskId;
    }

    @Override
    public String toString() {
        return "Task[ID=" + taskId + ", Name=" + taskName + ", Status=" + status + "]";
    }
}

class SinglyLinkedList {
    private Node head;

    private static class Node {
        Task data;
        Node next;

        Node(Task data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Task search(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.data.getTaskId().equals(taskId)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void traverse() {
        System.out.println("Current Task List:");
        Node current = head;
        if (current == null) {
            System.out.println("  The list is empty.");
        }
        while (current != null) {
            System.out.println("  " + current.data);
            current = current.next;
        }
        System.out.println();
    }

    public boolean delete(String taskId) {
        if (head == null) {
            return false;
        }

        if (head.data.getTaskId().equals(taskId)) {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null && !current.next.data.getTaskId().equals(taskId)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            return true;
        }

        return false;
    }
}

public class TaskManagement {
    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();

        taskList.add(new Task("T001", "Design Homepage", "In Progress"));
        taskList.add(new Task("T002", "Develop API", "Not Started"));
        taskList.add(new Task("T003", "Test Application", "Not Started"));
        taskList.add(new Task("T004", "Deploy to Server", "Completed"));

        taskList.traverse();

        System.out.println("Searching for task T002...");
        Task found = taskList.search("T002");
        if (found != null) {
            System.out.println("Found: " + found + "\n");
        } else {
            System.out.println("Task not found.\n");
        }

        System.out.println("Deleting task T003...");
        taskList.delete("T003");

        taskList.traverse();

        System.out.println("Deleting task T001...");
        taskList.delete("T001");

        taskList.traverse();
    }
}
