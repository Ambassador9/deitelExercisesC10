package chapterFive.menu;

public class CallRegister {

    public void missedCalls() {
        System.out.println("Missed calls");
    }

    public void receivedCalls() {
        System.out.println("Received calls");
    }

    public void dialledNumbers() {
        System.out.println("Dialled numbers");
    }

    public void eraseRecentCallLists() {
        System.out.println("Erase recent call lists");
    }

    public void showCallDuration() {
        System.out.println("""
                                Show call duration:
                                1. Last call duration
                                2. All calls' duration
                                3. Received calls' duration
                                4. Dialled calls' duration
                                5. Clear timers
                                """);
    }

    public void showCallCosts() {
        System.out.println("""
                                Show call costs:
                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters
                                """);
    }

    public void callCostSettings() {
        System.out.println("""
                                Call cost settings:
                                1. Call cost limit
                                2. Show costs in
                                """);
    }

    public void prepaidCredit() {
        System.out.println("Prepaid credit");
    }

    public void lastCallDuration() {
        System.out.println("Last call duration");
    }

    public void allCallsDuration() {
        System.out.println("All calls' duration");
    }

    public void receivedCallsDuration() {
        System.out.println("Received calls' duration");
    }

    public void dialledCallsDuration() {
        System.out.println("Dialled calls' duration");
    }

    public void clearTimers() {
        System.out.println("Clear timers");
    }

    public void lastCallCost() {
        System.out.println("Last call cost");
    }

    public void allCallsCost() {
        System.out.println("All calls' cost");
    }

    public void clearCounters() {
        System.out.println("Clear counters");
    }

    public void callCostLimit() {
        System.out.println("Call cost limit");
    }

    public void showCostsIn () {
        System.out.println("Show costs in");
    }
}
