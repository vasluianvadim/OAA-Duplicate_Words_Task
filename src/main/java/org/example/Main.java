package org.example;

import static org.example.DuplicateWordMethod.findDuplicateWords;

public class Main {
    public static void main(String[] args) {

        String text = "The enormous room on the ground floor faced towards the north. Cold for all the summer beyond the panes, for all the tropical heat of the room itself, a harsh thin light glared through the windows, hungrily seeking some draped lay figure, some pallid shape of academic gooseflesh, but finding only the glass and nickel and bleakly shining porcelain of a laboratory. Wintriness responded to wintriness. The overalls of the workers were white, their hands gloved with a pale corpse-colored rubber. The light was frozen, dead, a ghost. Only from the yellow barrels of the microscopes did it borrow a certain rich and living substance, lying along the polished tubes like butter, streak after luscious streak in long recession down the worktables.";
//        String text = "One two three four one one two";// check for only one sentence
        findDuplicateWords(text);
    }

}
