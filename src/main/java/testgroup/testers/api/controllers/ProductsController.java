package testgroup.testers.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testgroup.testers.business.abstracts.ProductService;
import testgroup.testers.entities.concretes.Product;

import java.util.List;

@RestController
@RequestMapping("/api/products")                          //dis dunyadan bu end pointle gelen isteklere bu cevap verecek demek
public class ProductsController {
                                                            // bu class bir api controller dis dunyaya acilimi sagliyor (api olarak web ios ang java connection i)


    private ProductService productService;
    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")                              //dis dunyadan "testers.io/api/products/getall" istegi gelirse bu calisacak
    public List<Product> getAll(){
        return this.productService.getAll();
    }

//    @PostMapping("/add")
//    public Result add(@RequestBody Product product){
//        return this.productService.add(product);
//    }
}
