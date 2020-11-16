package grocer.Customer;

class CustomerItemNotFoundException extends RuntimeException {

	CustomerItemNotFoundException(Long id) {
        super("Could not find Customer Item " + id);
    }
}