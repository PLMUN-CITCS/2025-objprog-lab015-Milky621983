public class VariableScope {

    // Declare a global variable
    static int globalCount = 100;

    public static void main(String[] args) {
        // Print globalCount from main
        System.out.println("Global Count (from main): " + globalCount);

        // Call the showScope method
        showScope();
    }

    // Method to demonstrate local and global variable scope
    public static void showScope() {
        // Declare a local variable
        int localCount = 50;

        // Print globalCount (accessible within this method because it's global)
        System.out.println("Global Count (from showScope): " + globalCount);

        // Print localCount (local to showScope method)
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
