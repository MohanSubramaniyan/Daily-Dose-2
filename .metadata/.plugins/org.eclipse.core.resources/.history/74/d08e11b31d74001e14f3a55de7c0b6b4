package intArray;
public class FindNonDup {

    public static void main(String[] args) {
        String[] array = {"hello","hello","hi","welcome"};

        String res = find(array);

        System.out.println("Non-Repetitive Element: " + res);
    }

    private static String find(String[] array) {
        for (int i = 0; i < array.length; i++) {
            String a= array[i];
            boolean is = false;

            for (int j = 0; j < array.length; j++) {
                if (i != j && a.equals(array[j])) {
                    is = true;
                    break;
                }
            }

            if (!is) {
                return a;
            }
        }

        // If no non-repetitive element is found, you can return a default value or handle it accordingly.
        return "no";
    }
}
