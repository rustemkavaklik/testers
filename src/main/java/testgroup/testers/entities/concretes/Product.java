package testgroup.testers.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity  //That is an entity class
@Table(name="products") //In database this class matches with products table
@Data  //Lombok anatotation
public class Product {
 // bu Product class'i database deki "products" tablosuna denk gelir
// after written entity name with @Data anatation creates setter-getter (lombok)

    @Id                                         //All queries will be implement with id (primary key)  //Yani sorgular id ile yapilacak
    @GeneratedValue                             //Increase Id's automatically    // id'ler atomatik olarak bir bir artirilacak eger bir veri eklersem
    @Column(name = "product_id")                //in database product_id = id
    private int id;

    @Column(name ="category_id")                //in database category_id = categoryId
    private int categoryId;

    @Column(name ="product_name")
    private String productName;

    @Column(name ="unit_price")
    private double unitPrice;

    @Column(name ="units_in_stock")
    private short unitsInStock;

    @Column(name ="quantity_per_unit")
    private String quantityPerUnit;

                                                 //lombok creates just noparameter constructor, but create parameter constructor create noparameter constructor
    public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock, String quantityPerUnit) {
        this.id = id;
        this.categoryId = categoryId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.quantityPerUnit = quantityPerUnit;
    }

    public Product() {

    }
//However it can not be seen, all getter-setter and toString methods are ready.
//It can be seen Structure from left
}
