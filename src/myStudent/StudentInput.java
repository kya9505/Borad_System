package myStudent;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentInput {

    private String filePath = "student.cvg";
    private final Map<Integer,Student> studentMap = new HashMap<>();

    private static final Pattern IdPattern = Pattern.compile("^\\d{6}$");
    private static final Pattern namePattern = Pattern.compile("^[a-zA-Z가-힣]+$");

    Scanner scanner = new Scanner(System.in);

    public int scorelimit(String subjectname){
        int score = 0;
       boolean check = false;
        while (!check) {
            System.out.println("0~100까지의 숫자를 입력해주세요.");
            System.out.print(subjectname + " 점수 : ");
            score = Integer.parseInt(scanner.nextLine());
            if (score < 0 || score > 100) {
                System.out.println("0부터 100까지의 숫자를 입력해주세요. ");
                check = false;
            }else check = true;
        }
        return score;
    }

    public void input(){
        while (true) {
            System.out.println("학생 정보 입력");
            System.out.println("학번(6자리 숫자입력) : ");
            String Id = scanner.nextLine();
            if (!IdPattern.matcher(Id).matches()) {
                System.out.println("6자리 숫자를 입력해주세요.");
                continue;
            }
            if (studentMap.containsKey(Integer.parseInt(Id))) {
                System.out.println("이미 사용중인 학번입니다.");
                continue;
            }

            System.out.println("이름(대소문자 영문, 한글 입력) : ");
            String name = scanner.nextLine();
            if (!namePattern.matcher(name).matches()){
                System.out.println("대소문자 영문,한글로 입력해주세요.");
                continue;
            }
            Student student = new Student(Id, name);
            System.out.println("과목별 점수를 입력해주세요.");
            student.subjects(scorelimit("korean"));
            student.subjects(scorelimit("english"));
            student.subjects(scorelimit("math"));
            student.subjects(scorelimit("science"));
            studentMap.put(Integer.parseInt(Id), student);

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
                String studentInfo = String.format("%s", studentMap.get(Integer.parseInt(Id)).toString());
                bw.write(studentInfo);
                bw.newLine();
                bw.flush();
                bw.close();
                System.out.println("파일 저장이 완료되었습니다.");
            } catch (IOException e) {
                System.out.println("파일 저장에 실패했습니다.");
                e.printStackTrace();
            }
            break;
        }
    }
}
