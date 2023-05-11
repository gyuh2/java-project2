package com.example.javaproject2.codeup;

import java.util.*;

class Student {
    private String code;
    private int testId;
    private String name;

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }

}

public class Codeup3108 {
    private List<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // code, testId, name을 입력 받아서 Student Object로 만들어주는 기능
    private Student makeAStudent(String code, int testId, String name) {
        return new Student(code, testId, name);
    }

    // students에 입력 받은 학생의 code가 중복되는지 여부 판단
    private boolean isExist(Student pStudent) {
        // is메소드명 -> boolean 리;
        // 중복 여부 check
        for (Student student : students) {
            if (pStudent.getTestId() == student.getTestId()) return true;
        }
        return false;
    }

    // students에 중복된 학생이 있는지 check한 후 없다면 add 아니면 넘어감
    private void addAStudent(Student student) {
        // private로 접근 제어
        // 중복 여부 check
        if (!isExist(student)) {
            students.add(student);
        }
    }

//    private void addAStudent(Student student) {
//        // 중복 여부 check
//        if (!isExist(student)) {
//            // 정렬
//            Collections.sort(students, new Comparator<Student>() {
//                @Override
//                public int compare(Student o1, Student o2) {
//                    return o1.getTestId() - o2.getTestId();
//                }
//            });
//
//            // 위치 찾기
//            int index = Collections.binarySearch(students, student, new Comparator<Student>() {
//                @Override
//                public int compare(Student o1, Student o2) {
//                    return o1.getTestId() - o2.getTestId();
//                }
//            });
//
//            // 삽입
//            students.add(index >= 0 ? index : -index - 1, student);
//        }
//    }

    private void deleteStudent(Student pStudent) {
        // pStudent가 students에 몇 번째에 있는지 알아야 함
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getTestId() == pStudent.getTestId()) students.remove(i);
        }
    }

    public void process(int size) {
        for (int i = 0; i < size; i++) {
            String input = sc.nextLine();
            String[] splitted = input.split(" ");

            Student student = makeAStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);
            switch (student.getCode()) {
                case "I" -> addAStudent(student);
                case "D" -> deleteStudent(student);
            }
        }
    }

    // students에 있는 모든 학생 출력
//    private void printStudent() {
//        for (Student student : students) {
//            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
//        }
//    }

    private void printSpecificStudents(int[] arr) {
        // 정렬
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTestId() - o2.getTestId();
            }
        });
        // 출력
        for (int i = 0; i < arr.length; i++) {
            Student student = students.get(arr[i] - 1);
            System.out.printf("%s %s\n", student.getTestId(), student.getName());
        }
    }

    // main(): 생성과 호출 담당
    public static void main(String[] args) {
        //int size = 1;
        //String[] splitted = "I 1011 한라산".split(" ");

        Codeup3108 codeup3108 = new Codeup3108();
        //Student student = codeup3108.makeAStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);
        int size = sc.nextInt();
        sc.nextLine(); // \n 버퍼에서 제거
        codeup3108.process(size);

        String input = sc.nextLine();
        String[] splitted = input.split(" ");
        int[] split = new int[splitted.length];
        for (int i = 0; i < splitted.length; i++) {
            split[i] = Integer.parseInt(splitted[i]);
        }
        codeup3108.printSpecificStudents(split);
    }
}
