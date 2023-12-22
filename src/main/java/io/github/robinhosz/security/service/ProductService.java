package io.github.robinhosz.security.service;

import io.github.robinhosz.security.dto.ProductDTO;
import io.github.robinhosz.security.entity.ProductEntity;
import io.github.robinhosz.security.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductEntity save(ProductDTO productDTO) {

        ProductEntity productEntity = ProductEntity.builder()
                .description(productDTO.getDescription())
                .price(productDTO.getPrice())
                .name(productDTO.getName())
                .quantity(productDTO.getQuantity())
                .build();


        return productRepository.save(productEntity);

    }

    public List<ProductDTO> findAll() {
        List<ProductEntity> products = productRepository.findAll();
        return products.stream().map(x -> ProductDTO.builder()
                .description(x.getDescription())
                .price(x.getPrice())
                .name(x.getName())
                .quantity(x.getQuantity())
                .build()).toList();
    }
}