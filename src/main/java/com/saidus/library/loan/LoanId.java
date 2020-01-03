package com.saidus.library.loan;

import com.saidus.library.book.Book;
import com.saidus.library.customer.Customer;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Data @ToString @EqualsAndHashCode
public class LoanId implements Serializable {

    private static final long serialVersionUID = 3912193101593832821L;

    @ManyToOne
    private Book book;

    @ManyToOne
    private Customer customer;

    @Column(name = "CREATION_DATE_TIME")
    private LocalDateTime creationDateTime = LocalDateTime.now();

}
