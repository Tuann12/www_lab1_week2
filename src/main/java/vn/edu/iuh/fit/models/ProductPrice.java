package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "product_price")
public class ProductPrice {
    @Id
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product productId;
    @Id
    private Date price_date_time;
    //    @Column(name = "price", nullable = false)
    @Column(name = "price_date_time")
    private Date priceDateTime;
    @Column(name = "price")
    private double price;
    @Column(name = "note")
    private String note;

    public ProductPrice() {
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Date getPrice_date_time() {
        return price_date_time;
    }

    public void setPrice_date_time(Date price_date_time) {
        this.price_date_time = price_date_time;
    }

    public Date getPriceDateTime() {
        return priceDateTime;
    }

    public void setPriceDateTime(Date priceDateTime) {
        this.priceDateTime = priceDateTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "productId=" + productId +
                ", price_date_time=" + price_date_time +
                ", priceDateTime=" + priceDateTime +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}
