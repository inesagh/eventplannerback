package com.example.eventplannerback.persistence.event.model;

import com.example.eventplannerback.persistence.customer.model.Customer;
import com.example.eventplannerback.persistence.employee.model.Employee;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateOfEvent;
    private Integer price;
    private String serialNumber;
    private String type;
    private String description;
    @ManyToOne
    private Customer customer;
    @ManyToMany
    private List<Employee> employee;

    public Event() {
    }

    public Event(Long id, Date dateOfEvent, Integer price, String serialNumber, String type, String description, Customer customer, List<Employee> employee) {
        this.id = id;
        this.dateOfEvent = dateOfEvent;
        this.price = price;
        this.serialNumber = serialNumber;
        this.type = type;
        this.description = description;
        this.customer = customer;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(Date dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (type != event.type) return false;
        if (description != null ? !description.equals(event.description) : event.description != null) return false;
        if (serialNumber != null ? !serialNumber.equals(event.serialNumber) : event.serialNumber != null) return false;
        return price != null ? price.equals(event.price) : event.price == null;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", dateOfEvent=" + dateOfEvent +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", customer=" + customer +
                ", employeeList=" + employee +
                '}';
    }
}
