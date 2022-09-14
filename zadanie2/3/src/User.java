public class User {
    String login;
    String password;
    Basket basket;

    public User(String login_, String password_, Basket basket_){
        login = login_;
        password = password_;
        basket = basket_;
    }
}
