import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> sort1List = new ArrayList<>();
        for (int sort1 : intList) {
            if (sort1 > 0 && sort1 % 2 == 0) {
                sort1List.add(sort1);
            }
        }
        Collections.sort(sort1List);
        for (int sort2Final : sort1List) {
                System.out.println(sort2Final);
            }

        }
    }

