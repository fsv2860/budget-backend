package com.example.expenseTracker.dto.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {
    private String id;
    private BigDecimal total;
    private String notes;
    private boolean income;
}
