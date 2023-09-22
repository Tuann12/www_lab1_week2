package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

@Entity
@Table(name = "product_image ")
public class ProductImage {
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long image_id;
    @Column(length = 250, nullable = false)
    private String path;
    @Column(length = 250)
    private String alternative;

    @ManyToOne
    private Product product;

    public ProductImage() {
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public long getImage_id() {
        return image_id;
    }

    public void setImage_id(long image_id) {
        this.image_id = image_id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "productId=" + productId +
                ", image_id=" + image_id +
                ", path='" + path + '\'' +
                ", alternative='" + alternative + '\'' +
                ", product=" + product +
                '}';
    }
}
