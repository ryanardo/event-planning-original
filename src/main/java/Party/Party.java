package Party;

public class Party {
    public int numberOfGuest; //Charge food-option per/guest
    public String food; //x10 course dinner: $100.00, x5 course dinner: $50.00, x3 course dinner: $20.00
    public String beverage; //Beer: $10.00, Wine: $15.00, Raw Water: $100.00
    public String entertainment; //DJ Music Person: $100,000, Nickleback: $10.00, You iPod on shuffle: $100.00
    public int coupon; //Free VHS copy of The Romantic epic "TITANIC", directed, written, co-produced and co-edited by James Cameron for party of 1 000 000 people, $1000.00 off for party of 1 000 people.

    public Party(int numberOfGuest, String food, String beverage, String entertainment, int coupon) {
        this.numberOfGuest = numberOfGuest;
        this.food = food;
        this.beverage = beverage;
        this.entertainment = entertainment;
        this.coupon = coupon;
    }


}
