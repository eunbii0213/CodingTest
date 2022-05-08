package KaKaoIntern2022;


import java.util.StringTokenizer;

public class Problem1 {
    // R T C F J M A N순으로 결과값 저장
    public static int[] count = new int[8];
    //문자 저장
    public static String[] str = new String[8];
    public String solution(String[] survey, int[] choices) {
        initialStrArr();

        for (int i = 0; i < survey.length; i++) {
            String result = calculateIndex(survey[i]);
            StringTokenizer st = new StringTokenizer(result, ",");

            int firstIndex = Integer.parseInt(st.nextToken());
            //System.out.println(str[firstIndex]);
            int secondIndex = Integer.parseInt(st.nextToken());
            //System.out.println(str[secondIndex]);

            if (choices[i] >= 4) {
                //동의 계열
                count[secondIndex] += calChoices(choices[i]);
                //System.out.println(str[secondIndex]+"에 "+calChoices(choices[i])+"증가");
            } else {
                //비동의 계열
                count[firstIndex] += calChoices(choices[i]);
                //System.out.println(str[firstIndex]+"에 "+calChoices(choices[i])+"증가");
            }
        }
        String answer = calAnswer();
        return answer;
    }

    public static String calAnswer() {
        String ans = "";

//        for (int i = 0; i < count.length; i++) {
//            System.out.println(count[i]);
//        }
        if (count[0] < count[1]) {
            ans += "T";
        } else {
            ans += "R";
        }

        if (count[2] < count[3]) {
            ans += "F";
        } else {
            ans += "C";
        }
        if (count[4] < count[5]) {
            ans += "M";
        } else {
            ans += "J";
        }
        if (count[6] < count[7]) {
            ans += "N";
        } else {
            ans += "A";
        }

        return ans;

    }

    public static int calChoices(int choice) {
        if (choice == 1 || choice == 7) {
            return 3;
        } else if (choice == 2 || choice == 6) {
            return 2;
        } else if (choice == 3 || choice == 5) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String calculateIndex(String surveyStr) {
        StringTokenizer st = new StringTokenizer(surveyStr, "R|T|C|F|J|M|A|N", true);
        String first = st.nextToken();
        //System.out.println(first);
        String second = st.nextToken();
        //System.out.println("second : "+second);
        //System.out.println(second);
        String result = "";

        for (int i = 0; i < str.length; i++) {
            //System.out.println(str[i]);
            if (str[i].equals(first)) {
                result += i + ",";
                break;
            }
        }

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(second)) {
                result += i;

                break;
            }
        }
        //System.out.println("result : "+result);

        return result;
    }

    public static void initialStrArr() {
        str[0] = "R";
        str[1] = "T";
        str[2] = "C";
        str[3] = "F";
        str[4] = "J";
        str[5] = "M";
        str[6] = "A";
        str[7] = "N";
    }
}

