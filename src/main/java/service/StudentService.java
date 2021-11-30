package service;

import model.Student;

import java.util.List;

public interface StudentService {
    List<Student> returnAll();
    Student findById(int id);
    void remove(int id);
    void update(int id, String name, float maths, float physics, float chemistry);
    void save(String name, double price, float maths, float physics, float chemistry);
    int findIndexById(int id);
}
