package app.models;

import javax.persistence.*;

@Entity
@Table(name = "customer", catalog = "", schema = "public")
@SequenceGenerator(name = "customer_customer_id_seq", sequenceName = "customer_customer_id_seq", allocationSize = 1)

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_customer_id_seq")
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "customer_full_name")
    private String customerFullName;
    @Column(unique = true)
    private String email;

    public Customer() {
    }

    public Customer(int customer_id, String customer_full_name, String email) {
        this.customerId = customer_id;
        this.customerFullName = customer_full_name;
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customer_full_name) {
        this.customerFullName = customer_full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
