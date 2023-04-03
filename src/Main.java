public class Main {

    public static void main(String []args) {
        int [] sales = new int[] {1, 2, 500, 700};
        SalesManager salesManager = new SalesManager (sales);

        int max = salesManager.max();

        System.out.println(max);
    }
}
