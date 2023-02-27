package com.example.expenseTracker.dto.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemSubcategoryDto {
    private String id;
    private String name;
    private String notes;
}
