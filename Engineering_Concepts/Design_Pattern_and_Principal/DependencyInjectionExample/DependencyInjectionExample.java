public class DependencyInjectionExample {

    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);

        String customer = customerService.findCustomer(1);
        System.out.println("Found customer: " + customer);

        customer = customerService.findCustomer(2);
        System.out.println("Found customer: " + customer);
    }
}

interface CustomerRepository {
    String findCustomerById(int id);
}

class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        if (id == 1) {
            return "Jane Doe";
        }
        return "Customer Not Found";
    }
}

class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String findCustomer(int id) {
        return customerRepository.findCustomerById(id);
    }
}
