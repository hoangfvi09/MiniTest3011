package model;

public class Student {
    private int id;
    private String name;
    private float maths;
    private float physics;
    private float chemistry;

    public Student() {
    }

    public Student(int id, String name, float maths, float physics, float chemistry) {
        this.id = id;
        this.name = name;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMaths() {
        return maths;
    }

    public void setMaths(float maths) {
        this.maths = maths;
    }

    public float getPhysics() {
        return physics;
    }

    public void setPhysics(float physics) {
        this.physics = physics;
    }

    public float getChemistry() {
        return chemistry;
    }

    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
    }
}
