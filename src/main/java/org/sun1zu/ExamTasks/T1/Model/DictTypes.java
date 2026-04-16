package org.sun1zu.ExamTasks.T1.Model;

public enum DictTypes {
    FIRST_LANG("Первый язык", "Длина слов может быть только 4 символа, и эти символы - только" +
            "буквы латинской раскладки"),
    SECOND_LANG("Второй язык", "Длина слов может быть только" +
            "5 символов, и эти символы - только цифры");

    private final String name;
    private final String hint;

    DictTypes(String name, String dict) {
        this.name = name;
        this.hint = dict;
    }

    public String getName() {
        return name;
    }

    public String getHint() {
        return hint;
    }
}
