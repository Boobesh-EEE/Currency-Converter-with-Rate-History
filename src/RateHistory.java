import java.util.Stack;

public class RateHistory {

    private Stack<String> history;

    public RateHistory() {
        history = new Stack<>();
    }

    public void pushRate(String rate) {
        history.push(rate);
    }

    public void undoRate() {
        if (history.isEmpty()) {
            System.out.println("No rate history available.");
        } else {
            System.out.println("Removed: " + history.pop());
        }
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No rate history available.");
        } else {
            System.out.println("\nRate History");
            System.out.println("---------------------");
            for (String rate : history) {
                System.out.println(rate);
            }
        }
    }
}