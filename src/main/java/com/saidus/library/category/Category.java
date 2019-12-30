package com.saidus.library.category;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "CATEGORY")
public class Category {

    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "LABEL", nullable = false)
    private String label;

}
