package testgroup.testers.business.abstracts;

import testgroup.testers.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
