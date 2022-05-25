package com.lmig.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@ApiModel(
        description = "This UserDto model contains the details of a user"
)
public class UserDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 6255361629607825203L;

    @ApiModelProperty(
            notes = "This is the user id i.e., uniquely identifies the user"
    )
    private Long id;
    private String email;
    private String name;
}
