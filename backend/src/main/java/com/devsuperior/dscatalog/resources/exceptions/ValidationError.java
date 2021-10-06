package com.devsuperior.dscatalog.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValidationError extends StandardError {

     private List<FieldMessage> errors = new ArrayList<>();

     public void addError(String fieldName, String message) {
         errors.add(new FieldMessage(fieldName, message));
     }
}
