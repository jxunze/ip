package Commands;

import Exceptions.InvalidInputException;
import TaskList.Tasks.Task;
import TaskList.Tasks.ToDo;
import Storage.Storage;

import java.io.IOException;
import java.util.List;

/**
 * Represents a command to delete a task from the task list.
 * A <code>DeleteCommand</code> object corresponds to a command with an index
 * e.g., <code>"delete 1"</code>
 */
public class DeleteCommand extends Command{
    public static final String COMMAND_WORD = "delete";
    int index;

    /**
     * Constructs a DeleteCommand object with an index.
     * @param index the index of the task to be deleted
     */
    public DeleteCommand(int index) {
        this.index = index;
    }

    /**
     * Executes the command to delete a task from the task list.
     * @return a string representing the result of executing the command
     * @throws IOException if an I/O error occurs
     */
    @Override
    public String execute() throws IOException {
        Task toBeDeleted = this.taskList.getTask(this.index);
        this.taskList.delete(this.index);
        String outputString = "I have removed the following task:\n" + toBeDeleted.toString()+"\nNow you have "+ this.taskList.size() + " tasks in your list.";
        return outputString;
    }
}
