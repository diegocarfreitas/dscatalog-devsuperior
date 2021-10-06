package com.devsuperior.dscatalog.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FieldMessage implements Serializable {

    private String fieldName;
    private String message;
}
