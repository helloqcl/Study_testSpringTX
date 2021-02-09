package personal.qcl.test.entities;

public class Order {
    private int orderId;
    private  User businessesId;
    private  User customerId;
    private int goodsId;
    private Double orderCount;
    private String orderName;
    private String orderDisc;

    public Order() {
    }

    public Order(int orderId, User businessesId, User customerId, int goodsId, Double orderCount, String orderName) {
        this.orderId = orderId;
        this.businessesId = businessesId;
        this.customerId = customerId;
        this.goodsId = goodsId;
        this.orderCount = orderCount;
        this.orderName = orderName;
    }

    public Order(int orderId, User businessesId, User customerId) {
        this.orderId = orderId;
        this.businessesId = businessesId;
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public User getBusinessesId() {
        return businessesId;
    }

    public void setBusinessesId(User businessesId) {
        this.businessesId = businessesId;
    }

    public User getCustomerId() {
        return customerId;
    }

    public void setCustomerId(User customerId) {
        this.customerId = customerId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public Double getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Double orderCount) {
        this.orderCount = orderCount;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderDisc() {
        return orderDisc;
    }

    public void setOrderDisc(String orderDisc) {
        this.orderDisc = orderDisc;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", businessesId=" + businessesId +
                ", customerId=" + customerId +
                ", goodsId=" + goodsId +
                ", orderCount=" + orderCount +
                ", orderName='" + orderName + '\'' +
                ", orderDisc='" + orderDisc + '\'' +
                '}';
    }
}
