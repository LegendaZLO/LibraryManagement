public class CarService {
    // Операция: Поиск автомобилей по марке
    public void searchByBrand(String brand) { 
        System.out.println("LOGIC: Searching for all cars of brand: " + brand);
        // Здесь могла бы быть сложная логика поиска в списке объектов Car
    }
    
    // Операция: Фильтрация клиентов по бюджету
    public void filterClientsByBudget(double budget) {
        System.out.println("LOGIC: Filtering clients with budget greater than " + budget);
        // Здесь могла бы быть сложная логика фильтрации списка клиентов
    }
}