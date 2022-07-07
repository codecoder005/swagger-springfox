package com.lmig.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(
        name = "users"
)
public class UserEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -8344888729014414056L;

    @Id
    private Long uid;
    private String name;
    private String email;
}
