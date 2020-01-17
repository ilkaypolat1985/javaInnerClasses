// Warning: SOLID - Single Responsibility Principle
public class DatabaseHelper {

    // Inner Static Class is used for classification within the class
    public static class CRUD{
        public static void delete(){}
        public static void update(){}
    }

    public static class Connection{
        public static void create(){}
        public static void close(){}
    }
}
