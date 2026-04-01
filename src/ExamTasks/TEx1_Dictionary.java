package ExamTasks;

import java.util.LinkedList;
import java.util.List;

enum DictTypes { UNRESTRICTED, FIRST_LANG, SECOND_LANG }

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

    public void ReadPairs() {
        // TODO
    }

    public void FindValue(String key) {
        // TODO
    }

    // It must follow the protection rules for a DictType
    public void AddValue(String key, String value) {
        // TODO
        keys.add(key);
        values.add(value);
    }

    private boolean LangCheck(String s) {
        if(type == DictTypes.FIRST_LANG) {
            String eng_alp = "qwertyuiopasdfghjklzxcvbnm";

            for (int i=0; i<s.length(); i++) {
                if (eng_alp.indexOf(s.charAt(i)) == -1) return false;
            }

            return s.length() != 4; // TODO: WIP
        }
        else if (type == DictTypes.SECOND_LANG) {

        }

        return true;
    }
}
