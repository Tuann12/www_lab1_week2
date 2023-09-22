package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.pks.OrderDetailPK;

import java.util.List;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @EmbeddedId
    private OrderDetailPK pk;
    @Column(name = "quantity")
    private double quantity;
    @Column(name = "price")
    private double price;
    @Column(name = "note")
    private String note;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order_id;
    @OneToMany
    @JoinColumn(name = "product_id")
    private List<Product> listProduct;

    public OrderDetail() {
    }

    public OrderDetailPK getPk() {
        return pk;
    }

    public void setPk(OrderDetailPK pk) {
        this.pk = pk;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
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

    public Order getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Order order_id) {
        this.order_id = order_id;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "pk=" + pk +
                ", quantity=" + quantity +
                ", price=" + price +
                ", note='" + note + '\'' +
                ", order_id=" + order_id +
                ", listProduct=" + listProduct +
                '}';
    }
}
