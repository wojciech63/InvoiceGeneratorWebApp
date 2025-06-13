package in.webappproject.invoicegeneratorapi.repository;

import in.webappproject.invoicegeneratorapi.entity.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvoiceRepository extends MongoRepository<Invoice, String> {



}
