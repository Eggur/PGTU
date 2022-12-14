package exercise2;

import java.util.*;

public class NumberOfLanguages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int countStudents = input.nextInt();

        Map<String, Integer> allLangs = new HashMap<String, Integer>();
        HashSet<String> langs = new HashSet<String>();

        for (int i = 0; i < countStudents; i++) {
            System.out.println("Enter the number of languages the student knows");
            int countLangs = input.nextInt();
            System.out.println("Enter names on a new line");
            for (int j = 0; j < countLangs; j++) {
                String lang = input.next();
                langs.add(lang);
                if (!allLangs.containsKey(lang)) {
                    allLangs.put(lang, 1);
                } else {
                    allLangs.put(lang, allLangs.get(lang) + 1);
                }
            }
        }

        List<String> knownLangs = getKnownToAllLangs(allLangs, countStudents);
        System.out.println(knownLangs.size());
        for(String lang : knownLangs) {
            System.out.println(lang);
        }

        System.out.println(langs.size());
        for(String lang : langs){
            System.out.println(lang);
        }


    }

    static List<String> getKnownToAllLangs(Map<String, Integer> langsMap, int countStudents) {
        List<String> langs = new ArrayList<String>();
        for(Map.Entry entry : langsMap.entrySet()) {
            if ((int)entry.getValue() == countStudents) {
                langs.add((String)entry.getKey());
            }
        }
        return langs;
    }
}
