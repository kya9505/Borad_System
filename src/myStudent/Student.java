package myStudent;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String Id;
    private List<Integer> subjects = new ArrayList<>();

    public Student(String Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    public List<Integer> subjects(int score){
        subjects.add(score);

        return subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public List<Integer> getSubject() {
        return subjects;
    }

    public void setSubject(List<Integer> subject) {
        this.subjects = subject;
    }

    public int total(){
        int total = 0;
        for(int score : subjects){
            total += score;
        }
        return total;
    }

    public double average(){
        if (subjects.isEmpty()) {
            return 0.0;
        }
        double average = (double) total()/subjects.size();
        return average;
    }

    public String grade(){
        int grade = (int)average()/10;
        switch (grade){
            case 9 : return "A";
            case 8 : return "B";
            case 7 : return "C";
            case 6 : return "D";
            default: return "F";
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Id='" + Id + '\'' +
                ", korean score ='" + subjects.get(0) + '\'' +
                ", english score ='" + subjects.get(1)+'\'' +
                ", math score = '"+ subjects.get(2) + '\'' +
                ", science score ='" + subjects.get(3) +
                '}' ;

    }
}
