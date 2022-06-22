package testgroup.testers.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import testgroup.testers.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {
    //Verilen entity-veri tipi icin (entity anatosyonu ile suslenmis nesne icin "products"), Ve primary key tipi ni de ver "integer" ve Jpa sorgulari hazirlasin
}
