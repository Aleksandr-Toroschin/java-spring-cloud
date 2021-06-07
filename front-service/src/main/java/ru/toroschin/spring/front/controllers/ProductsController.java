package ru.toroschin.spring.front.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ru.toroschin.spring.front.dtos.ProductDto;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
@Slf4j
public class ProductsController {
    private final RestTemplate restTemplate;

    @GetMapping
    public List<ProductDto> getAllProducts() {
        ProductDto[] productDto = restTemplate.getForObject("http://localhost:8188/market/api/v1/products", ProductDto[].class);
        log.info(productDto.toString());
        List<ProductDto> products = Arrays.asList(productDto);
//        List<ProductDto> products = (java.util.List<ProductDto>) productDto.getBody();
//        return List.of(new ProductDto());
        return products;
    }

    @GetMapping("/{id}")
    public ProductDto getOneProduct(@PathVariable Long id) {
        ProductDto product = restTemplate.getForObject("http://localhost:8188/market/api/v1/products/"+id, ProductDto.class);
        return product;
    }

//    @PostMapping("/add")
//    public ProductDto createProduct(@RequestBody @Validated ProductDto productDto, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            throw new InvalidDataException(bindingResult.getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.toList()));
//        } else {
//            return productService.saveDto(productDto);
//        }
//    }
//
//    @PostMapping("/addFromFile")
//    public List<ProductDto> createProductsFromFile(@RequestBody @Validated ProductDto productDto, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            throw new InvalidDataException(bindingResult.getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.toList()));
//        } else {
//            return List.of(productService.saveDto(productDto));
//        }
//    }

//    @DeleteMapping
//    public void deleteProduct(@RequestBody Product product) {
//        productService.delete(product.getId());
//    }
//
//    @PutMapping
//    public ProductDto updateProduct(@RequestBody ProductDto productDto) {
//        return productService.update(productDto);
//    }
}
