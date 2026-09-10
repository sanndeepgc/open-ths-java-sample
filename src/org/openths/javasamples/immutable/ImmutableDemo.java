package org.openths.javasamples.immutable;

import java.time.LocalDateTime;
import java.util.Date;

public class ImmutableDemo {
    static void main(String[] args) {
        Invoice invoice = new Invoice("SSD8989", 989, LocalDateTime.now(), new Date());
        System.out.println("Initial Date : " + invoice);
        Date invoiceCreatedDate = invoice.getCreatedDate();
        invoiceCreatedDate.setDate(29);
        invoiceCreatedDate.setYear(2000);

        System.out.println("Post modifying the created date field : " + invoice);
    }
}
