package com.java.everis.client.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@Document("TYPECUSTOMER")
@AllArgsConstructor
@NoArgsConstructor
public class TypeCostumer {
    @Id
    String _id;

    @NotEmpty
    String type;
}
