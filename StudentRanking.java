public class StudentRanking {

    // Generic function to find the maximum value
    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Find highest CGPAs
        Float[] cgpa = {8.9f, 9.2f, 8.5f, 9.8f};
        System.out.println("Highest CGPA: " + findMax(cgpa));

        // Find highest total
        Integer[] total = {450, 472, 490, 460};
        System.out.println("Highest Total: " + findMax(total));

        // Find name that comes last alphabetically
        String[] names = {"Anu", "Ravi", "Bala", "Kiran", "Zara"};
        System.out.println("Name that comes last alphabetically: " + findMax(names));
    }
}
