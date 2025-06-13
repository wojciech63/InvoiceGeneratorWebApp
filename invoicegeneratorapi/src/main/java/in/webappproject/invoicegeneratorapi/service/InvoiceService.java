package in.webappproject.invoicegeneratorapi.service;

import in.webappproject.invoicegeneratorapi.entity.Invoice;
import in.webappproject.invoicegeneratorapi.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public Invoice saveInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    public List<Invoice> fetchInvoices(){
        return invoiceRepository.findAll();
    }

    public void removeInvoice(String invoiceId) {
        Invoice existingInvoice = invoiceRepository.findById(invoiceId)
            .orElseThrow(() -> new RuntimeException("Invoice not found: " +invoiceId));
        invoiceRepository.delete(existingInvoice);
    }
}
