package GoogleHashCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Contributor{
    static String name;
    static String[] skill;
    static int[] skillNum;

    Contributor(String name, int languageCount ){
        this.name = name;
        skill = new String[languageCount];
        skillNum = new int[languageCount];
    }

    public static void addSkill(String language, int languageSkill, int count){
        skill[count] = language;
        skillNum[count] = languageSkill;
    }
}

class Project{
    static String name;
    static int day;
    static int score;
    static int bestBefore;
    static int contributionNeed;
    static String[] needLanguage;
    static int[] needLanguageNum;

    public Project( String name, int day, int score, int bestBefore, int needContributor ){
        this.name = name;
        this.day = day;
        this.score = score;
        this.bestBefore = bestBefore;
        this.contributionNeed = contributionNeed;
    }

    public static void setNeedlanguage(String language, int languageSkill, int count){
        needLanguage[count] = language;
        needLanguageNum[count] = languageSkill;

    }
}
public class Example{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        Contributor[] contributor = new Contributor[C];
        Project[] project = new Project[P];

        for(int i=0;i<C;i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int languageCount = Integer.parseInt(st.nextToken());
            contributor[i] = new Contributor(name, languageCount);
            Contributor con = contributor[i];

            for(int j=0; j<languageCount; j++){
                st = new StringTokenizer(br.readLine());
                String language = br.readLine();
                int languageSkill = Integer.parseInt(st.nextToken());

                con.addSkill(language, languageSkill,j);
            }

        }



        for(int i=0;i<P;i++){ //최전일 : 유통기한, 완료하기위해 걸리는 기간?? day0부터시작.
            //bestbefore이 deadline 같은 것. 하루 넘길 때 마다 score깎임.
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            int bestBefore = Integer.parseInt(st.nextToken());
            int needContributor = Integer.parseInt(st.nextToken());

            project[i] = new Project(name, day, score, bestBefore, needContributor);

            for(int j=0;j<needContributor;j++){
                Project pro = project[i];
                st = new StringTokenizer(br.readLine());
                String language = br.readLine();
                int languageSkill = Integer.parseInt(st.nextToken());

                pro.setNeedlanguage(language,languageSkill,j);
            }


        }


    }
}
