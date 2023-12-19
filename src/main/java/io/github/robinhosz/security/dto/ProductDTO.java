package io.github.robinhosz.security.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {

    private String name;
    private String description;
    private Integer quantity;
    private Double price;
}
