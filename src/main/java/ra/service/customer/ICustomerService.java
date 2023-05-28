package ra.service.customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ra.model.Customer;
import ra.model.Province;
import ra.service.IGenerateService;

public interface ICustomerService extends IGenerateService<Customer> {
//    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable);

}
