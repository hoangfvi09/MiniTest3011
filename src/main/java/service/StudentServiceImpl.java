package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private static ArrayList<Student> students;
    private static int numbersOfStudents = 0;

    static {
        students = new ArrayList<>();
        students.add(new Student(numbersOfStudents++, "A", 8, 7, 6));
        students.add(new Student(numbersOfStudents++, "B", 9, 9, 9));
        students.add(new Student(numbersOfStudents++, "C", 10, 10, 6));
        students.add(new Student(numbersOfStudents++, "D", 7, 4, 10));
    }

    @Override
    public List<Student> returnAll() {
        return students;
    }

    @Override
    public Student findById(int id) {
        return students.get(findIndexById(id));
    }

    @Override
    public void remove(int id) {
        students.remove(findIndexById(id));

    }

    @Override
    public void update(int id, String name, float maths, float physics, float chemistry) {
        Student student = students.get(findIndexById(id));
        student.setName(name);
        student.setMaths(maths);
        student.setChemistry(chemistry);
        student.setPhysics(physics);
    }

    @Override
    public void save(String name, double price, float maths, float physics, float chemistry) {
        Student student = new Student(numbersOfStudents++, name, maths, physics, chemistry);
        students.add(student);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
