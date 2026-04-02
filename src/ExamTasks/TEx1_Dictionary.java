package ExamTasks;

import java.util.LinkedList;
import java.util.List;

public class TEx1_Dictionary {
    private List<String> keys;
    private List<String> values;
    private DictTypes type = DictTypes.FIRST_LANG;

    public TEx1_Dictionary (DictTypes dictionaryType) {
        keys = new LinkedList<>();
        values = new LinkedList<>();
    }

    public void ParseFile(String filename){
        // TODO
    }

    public void PrintPairs() {
        for (int i=0; i< keys.size(); i++) {
            IO.println(String.format("%s: %s", keys.get(i), values.get(i)));
        }
    }

    private int FindValueID(String key) {
        for (int i=0; i<keys.size(); i++) {
            if (key.equals(keys.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public void FindValue(String key) {
        int id = FindValueID(key);
        IO.println(id == -1 ? "No value found!" : values.get(id));
    }

    public void DeletePairByKey(String key) {
        int id = FindValueID(key);
        if (id == -1) {
            IO.println("No key found!");
            return;
        }

        keys.remove(id);
        values.remove(id);
    }

    // It must follow the protection rules for a DictType
    public void AddValue(String key, String value) {
        if (!LangCheck(key)) {
            IO.println("Error: the key is invalid!");
            return;
        }

        keys.add(key);
        values.add(value);
    }

    private boolean LangCheck(String s) {
        if(type == DictTypes.FIRST_LANG) {
            String eng_alp = "qwertyuiopasdfghjklzxcvbnm";

            for (int i=0; i<s.length(); i++) {
                if (eng_alp.indexOf(Character.toLowerCase(s.charAt(i))) == -1) return false;
            }

            return s.length() == 4;
        }
        else if (type == DictTypes.SECOND_LANG) {
            for(int i=0; i<s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    return false;
                }
            }

            return s.length() == 5;
        }

        return true;
    }
}
