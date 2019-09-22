public class Main {
    public static void main(String[] args) {
        Burger cheeseburger = new Burger();
        cheeseburger.id = 2336;
        cheeseburger.name = "Чизбургер";
        cheeseburger.priceInKopek = 6900;
        cheeseburger.weight = 167;
        cheeseburger.pictureUrl = "https://s82079.cdn.ngenix.net/9VW3RQfY33AnJi7Yu38nKiHc.png?dw=230";
        cheeseburger.description = "Пряный горчичный соус, кетчуп, сочные стрипсы в оригинальной панировке, лук, сыр Чеддер, огурцы на пшеничной булочке с кукурузной посыпкой.";
        cheeseburger.fats = 8.6;
        cheeseburger.proteins = 13.2;
        cheeseburger.carbohydrates = 26.6;
        Burger cheefburger = new Burger();
        cheefburger.id = 2384;
        cheefburger.name = "Шефбургер";
        cheefburger.priceInKopek = 12900;
        cheefburger.weight = 213;
        cheefburger.pictureUrl = "https://s82079.cdn.ngenix.net/5ryrwTKuHTR5tX81w878Wuud.png?dw=230&quot";
        cheefburger.description = "Попробуйте новый уникальный бургер от шефа! Нежный сливочный соус, сочное филе в оригинальной панировке, салат айcберг и помидоры на пшеничной булочке с черно-белым кунжутом.";
        cheefburger.fats = 10.7;
        cheefburger.proteins = 13;
        cheefburger.carbohydrates = 22;

        System.out.println(cheeseburger.name + " Цена:" + cheeseburger.priceInKopek / 100 + " Калорийность:" + cheeseburger.getCalories());
        System.out.println(cheefburger.name + " Цена:" + cheefburger.priceInKopek / 100 + " Вес: " + cheefburger.weight);
    }
}
