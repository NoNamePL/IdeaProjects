package springboot.topjava.ru;

public class PaymentRequest {
    private int userId;
    private String itemId;
    private double discount;

    public String getItemId() {
        return itemId;
    }

    public int getUserId() {
        return userId;
    }

    public double getDiscount() {
        return discount;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
