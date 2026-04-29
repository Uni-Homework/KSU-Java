package org.sun1zu.ExamTasks.T1.Model;

public interface MyDict {
    void AddValue(String key, String value);
    void FindValue(String key);
    void DeletePairByKey(String key);
}
