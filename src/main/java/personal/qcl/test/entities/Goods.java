package personal.qcl.test.entities;

public class Goods {
    private int goodsId;
    private int catalogId;
    private String goodsName;
    private double goodsPrice;
    private  double goodsCount;
    private     String goodsDescribe;

    public Goods() {
    }

    public Goods(int goodsId, int catalogId, String goodsName, double goodsPrice) {
        this.goodsId = goodsId;
        this.catalogId = catalogId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
    }

    public Goods(int goodsId, int catalogId, String goodsName, double goodsPrice, double goodsCount, String goodsDescribe) {
        this.goodsId = goodsId;
        this.catalogId = catalogId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsCount = goodsCount;
        this.goodsDescribe = goodsDescribe;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", catalogId=" + catalogId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsCount=" + goodsCount +
                ", goodsDescribe='" + goodsDescribe + '\'' +
                '}';
    }
}
