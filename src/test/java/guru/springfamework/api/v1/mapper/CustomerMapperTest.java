package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.CustomerDto;
import guru.springfamework.domain.Customer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerMapperTest {

    CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    private static final String LAST_NAME = "bob";
    private static final String FIRST_NAME = "billy";

    @Test
    public void customerToCustomerDtoTest() {
        // given
        Customer customer = new Customer();
        customer.setFirstName(FIRST_NAME);
        customer.setLastName(LAST_NAME);

        //when
        CustomerDto customerDto = customerMapper.customerToCustomerDto(customer);

        //then
        assertEquals(FIRST_NAME, customerDto.getFirstName());
        assertEquals(LAST_NAME, customerDto.getLastName());
    }
}
