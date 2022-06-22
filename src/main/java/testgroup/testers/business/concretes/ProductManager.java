package testgroup.testers.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testgroup.testers.business.abstracts.ProductService;
import testgroup.testers.dataAccess.abstracts.ProductDao;
import testgroup.testers.entities.concretes.Product;

import java.util.List;
@Service    //bu class service gorevini gorecek
public class ProductManager implements ProductService {
    //business icindeki ProductService'in implementasyonu

    //DataAccess deki veriye ulasmamiz lazim bunun icin
    private ProductDao productDao;

    @Autowired  //auto olarak projeyi tarar ve bu productDao'ya denk geleni bulur, yerlestirir
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }



    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
