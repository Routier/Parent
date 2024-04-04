import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {
    @Test
    public void matchesSimpleTaskTrue() {
        SimpleTask simpleTask = new SimpleTask(3, "ниф-ниф");

        boolean expected = true;
        boolean actual = simpleTask.matches("ниф-ниф");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void matchesSimpleTaskFalse() {
        SimpleTask simpleTask = new SimpleTask(3, "ниф-ниф");

        boolean expected = false;
        boolean actual = simpleTask.matches("нaф-нaф");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void matchesMeetingTrueProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Приложение НетоБанка");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesMeetingTrueTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Выкатка 3й версии приложения");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesMeetingFalse() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = meeting.matches("Во вторник после обеда");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesEpicTrue() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Яйца");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesEpicFalse() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("Меч Тысячи Истин");

        Assertions.assertEquals(expected, actual);
    }
}
