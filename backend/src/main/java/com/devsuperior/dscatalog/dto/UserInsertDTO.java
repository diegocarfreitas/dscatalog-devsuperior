package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.services.validation.UserInsertValid;
import lombok.Data;

@Data
@UserInsertValid
public class UserInsertDTO extends UserDTO {

    private String password;
}
