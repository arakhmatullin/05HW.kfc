public class Burger {
    int id;
    int priceInKopek;
    String pictureUrl;
    String name;
    int weight;
    String description;
    double proteins;
    double fats;
    double carbohydrates;

    int getCalories() {
        return (int) (proteins * 4 + fats * 9 + carbohydrates * 4);
    }
}
