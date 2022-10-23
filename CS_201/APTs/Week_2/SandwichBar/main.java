public class main {
    public static void main(String[] args) {
        SandwichBar2 order = new SandwichBar2();
        String[] myPref = {"bread lettuce", "pickles bread"};
        String[] available =  {"lettuce", "tomato", "bread"};
        System.out.println(order.whichOrder(available, myPref));
    }
}
