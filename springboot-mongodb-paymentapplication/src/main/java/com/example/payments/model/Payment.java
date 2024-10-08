package com.example.payments.model;

import com.example.payments.dto.Item;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "payments")
@Builder
public class Payment {
    @Id
    private String id;
    private Double amount;
    private String currency;
    private String username;
    private String ponumber;
    private String invoicenumber;
    private String targetBankAccount;
    private String sourceBankAccount;
    private int tds;
    private String status;
    private String paymentdate;

    private String BuyersInfo;
    private String VendorInfo;
    private List<Item> items;


}
