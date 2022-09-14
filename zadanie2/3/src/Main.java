public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Стул", 1500, 7.8);
        Product product2 = new Product("Стол", 5000, 8.1);
        Product product3 = new Product("Ложка", 200, 4.6);

        Category category1 = new Category("Для кухни");
        category1.products = new Product[]{product1, product2, product3};

        User user = new User("qwerty", "12345", new Basket());

        user.basket.boughtProducts = new Product[]{product1, product2, product3, product3};

        for(int i = 0; i < user.basket.boughtProducts.length; i++){
            System.out.println(user.basket.boughtProducts[i].name + " " + user.basket.boughtProducts[i].cost);
        }
    }
}