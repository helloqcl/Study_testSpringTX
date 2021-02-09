package personal.qcl.test.service.entities;

import org.springframework.stereotype.Service;
import personal.qcl.test.entities.User;

import java.util.Date;
@Service
public class Transfer {
    private User customerId;
    private User businessesId;
    private Date date;

    public Transfer() {
    }

    public Transfer(User customerId, User businessesId) {
        this.customerId = customerId;
        this.businessesId = businessesId;
    }

    public User getCustomerId() {
        return customerId;
    }

    public void setCustomerId(User customerId) {
        this.customerId = customerId;
    }

    public User getBusinessesId() {
        return businessesId;
    }

    public void setBusinessesId(User businessesId) {
        this.businessesId = businessesId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "customerId=" + customerId +
                ", businessesId=" + businessesId +
                ", date=" + date +
                '}';
    }
}

