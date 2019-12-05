package frontend;

public interface Ui {
    /**
     * Removes the clear screen string if the OS is windows.
     */
    void removeClearScreen();

    /**
     * Sets simulations to run faster.
     */
    void setFastMode();

    /**
     * Prints the message in the terminal.
     * @param message to be printed.
     */
    void show(String message);

    /**
     * Prints the exit message.
     */
    void showExit();

    /**
     * Prints an error in the terminal.
     * @param message to be printed as an error.
     */
    void showError(String message);

    /**
     * Prints a warning in the terminal.
     * @param message as the warning message.
     */
    void showWarning(String message);

    /**
     * Clears the screen.
     */
    void clearScreen();

    /**
     * Prints a message as an info.
     * @param message as the info message.
     */
    void showInfo(String message);

    /**
     * Gets user input.
     * @return the user input.
     */
    String getInput();

    /**
     * Delays the program.
     * @param delay time in milliseconds.
     */
    void sleep(int delay);

    /**
     * shows a hint.
     * @param text the text to be shown as a hint
     */
    void showHint(String text);


    /**
     * Prints text to the terminal type writer style.
     * @param text to be printed.
     * @param hasPressEnter if 'Press ENTER' should be added to the print.
     */
    void typeWriter(String text, boolean hasPressEnter);
}
