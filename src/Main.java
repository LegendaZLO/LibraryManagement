public class Main {
    public static void main(String[] args) {
        System.out.println("--- FINAL APPLICATION LAUNCHED V1.0 ---"); // <-- Только эту строку!

        CarService service = new CarService();
// ...
        
        // 1. Тестируем операцию поиска автомобилей по марке
        System.out.println("--- Testing Search Operation ---");
        service.searchByBrand("Audi");
        
        // 2. Тестируем операцию фильтрации клиентов по бюджету
        System.out.println("\n--- Testing Filter Operation ---");
        service.filterClientsByBudget(50000.00);
        
        System.out.println("\n--- Application Finished ---");
    }
}