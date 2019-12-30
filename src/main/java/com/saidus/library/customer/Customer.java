package com.saidus.library.customer;

import com.saidus.library.loan.LoanId;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_ID")
    private Integer id;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "JOB")
    private String job;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "CREATION_DATE", nullable = false)
    private LocalDate creationDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.customer", cascade = CascadeType.ALL)
    Set<LoanId> loans = new HashSet<LoanId>();
}
