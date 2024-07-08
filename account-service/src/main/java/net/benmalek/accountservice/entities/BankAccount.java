package net.benmalek.accountservice.entities;


import jakarta.persistence.*;
import lombok.*;
import net.benmalek.accountservice.enums.AccountType;
import net.benmalek.accountservice.model.Customer;

import java.time.LocalDate;
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccount {
    @Id
    private String accountId;
    private double balance;
    private LocalDate createAt;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Transient //ignore cet attribut  , il est présent dans la classe mais qui n'est représenté au niveau de la base de données
    public Customer customer;
    private Long customerId;

}
