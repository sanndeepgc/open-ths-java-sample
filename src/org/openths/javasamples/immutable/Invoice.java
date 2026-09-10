package org.openths.javasamples.immutable;
import java.time.LocalDateTime;
import java.util.Date;

public final class Invoice {
    private final String invoiceNumber;
    private final double amount;
    private final LocalDateTime issueDate;
    private final Date createdDate;

    public Invoice(String invoiceNumber, double amount, LocalDateTime issueDate, Date createdDate) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
        this.issueDate = issueDate;
        this.createdDate =  new Date(createdDate.getTime());;
    }

    public String getInvoiceNumber(){
        return  this.invoiceNumber;
    }

    public double getAmount(){
        return this.amount;
    }

    public LocalDateTime getIssueDate(){
        return this.issueDate;
    }

    public Date getCreatedDate(){
        return  new Date(createdDate.getTime());
    }

    @Override
    public String toString() {
        return this.invoiceNumber + " " + this.amount + " " + this.issueDate + " " + this.createdDate ;
    }
}
