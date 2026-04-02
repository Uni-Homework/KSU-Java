import Lab4.*;
import ExamTasks.*;

import static ExamTasks.DictTypes.*;

void main() {
    // CheckLab4();
    CheckEx1();
}

void CheckEx1(){
    IO.println("Выберите язык словаря [A: Язык 1, b: язык 2]");

    var lang = Character.toLowerCase(IO.readln().charAt(0)) == 'b' ? SECOND_LANG : FIRST_LANG;
    var dict = new TEx1_Dictionary(lang);

    dict.AddValue("12345", "First pair!");
    dict.AddValue("54321", "Second pair!");
    dict.AddValue("abcd", "Third pair!");
    dict.AddValue("QTYW", "Fourth pair!");

    dict.PrintPairs();
    dict.DeletePairByKey("54321");
    dict.DeletePairByKey("abcd");

    dict.FindValue("QTYW");
    dict.FindValue("abcd");
    dict.FindValue("54321");
}

void CheckLab4(){
    IO.println("Solving Lightning");
    new T1_Lightning().Solve();

    IO.println("Solving BackwardString");
    new T2_BackwardString().Solve(IO.readln());

    IO.println("Solving Marathon");
    new T3_Marathon().Solve();

    IO.println("Solving Palindrome");
    IO.println(new T4_Palindrome().Solve(IO.readln()));

    IO.println("Solving Time");
    new T5_Time().Solve(Integer.parseInt(IO.readln()));
}