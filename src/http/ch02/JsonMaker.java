package http.ch02;

import java.util.ArrayList;
import java.util.List;

public class JsonMaker {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 21;
        List<String> subjects = new ArrayList<>();
        subjects.add("수학");
        subjects.add("물리");
        subjects.add("C:\\java\\workspace");

        // 위 데이터를 메서드를 호출해서 JSON 형식의 문자열로 변환하는 기능을 호출할 예정
        String jsonStr = toJson(name, age, subjects);
        System.out.println(jsonStr);
    }
    public static String toJson(String name, int age, List<String> subjects) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("\t\"name\" : \"").append(name).append("\",\n");
        sb.append("\t\"age\" : ").append(age).append(",\n");
        sb.append("\t\"subjects\" : ").append("[\n");

        for (int i = 0; i<subjects.size(); i++) {
            if ((i+1)==subjects.size()) {
                sb.append("\t  \"").append(subjects.get(i)).append("\"\n");
                break;
            }
            sb.append("\t  \"").append(subjects.get(i)).append("\",\n");
        }

        sb.append("\t]\n");
        sb.append("}");
        return sb.toString();
    }
}
/*
실행 결과:
{
  "name": "홍길동",
  "age": 21,
  "subjects": [
    "수학",
    "물리",
    "컴퓨터 과학"
  ]
}
*/