package kodlama.io.rentACar.business.abtracts;

import kodlama.io.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
