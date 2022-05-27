package com.example.expenseTracker.exception;

public class ItemCategoryNotFoundException extends RuntimeException{
    public ItemCategoryNotFoundException(Long id){
        super("Item category " + id + " not found.");
    }
}
