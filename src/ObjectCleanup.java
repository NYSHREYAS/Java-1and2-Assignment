public class ObjectCleanup {
    static class Resource {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Resource object is being garbage collected.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Creating Resource objects...");
        Resource res1 = new Resource();
        Resource res2 = new Resource();

        res1 = null; // Marking the first object for garbage collection
        res2 = null; // Marking the second object for garbage collection

        System.out.println("Requesting garbage collection...");
        System.gc(); // Request garbage collection

        System.out.println("Program execution continues...");
    }
}
