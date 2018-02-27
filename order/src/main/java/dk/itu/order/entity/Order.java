package dk.itu.order.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_order")
public class Order {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "order_name")
    private String orderName;

    @Column(name = "user_id")
    private int userID;
}
