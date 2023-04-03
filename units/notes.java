package MyNotes.units;

public class notes {
    public static void main(String[] args) {

        String multipleLines = "Welcom to MyNotes app!"
                + System.lineSeparator() + "Available commands:"
                + System.lineSeparator() + "/help - list  of available commands"
                + System.lineSeparator() + "/add - add new note"
                + System.lineSeparator() + "/selection - selection menu";

        System.out.println(multipleLines);

    }
}
