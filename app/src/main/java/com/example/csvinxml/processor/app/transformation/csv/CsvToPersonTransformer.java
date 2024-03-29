package com.example.csvinxml.processor.app.transformation.csv;

import com.example.csvinxml.processor.app.transformation.Person;
import com.example.csvinxml.processor.app.transformation.Invoice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CsvToPersonTransformer {
    public List<Person> convert(List<List<String>> csvRows){
        List<Person> results = new ArrayList<Person>();
        for (List<String> csvRow : csvRows) {
            Person person = new Person();
            person.setFirstName(csvRow.get(0));
            person.setLastName(csvRow.get(1));
            results.add(person);
        }
        return results;
    }
    public List<Invoice> convertInvoice(List<List<String>> csvRows) throws ParseException {
        List<Invoice> results = new ArrayList<Invoice>();
        for (List<String> csvRow : csvRows) {
            Invoice invoice = new Invoice();
            invoice.setBuyerName(csvRow.get(0));
            invoice.setImageName(csvRow.get(1));
            String invoiceImage = csvRow.get(2);
            invoice.setInvoiceImage(invoiceImage);
            invoice.setInvoiceDueDate(csvRow.get(3));

            invoice.setInvoiceNumber(csvRow.get(4));
            invoice.setInvoiceAmount(csvRow.get(5));
            invoice.setInvoiceCurrency(csvRow.get(6));
            invoice.setInvoiceStatus(csvRow.get(7));
            invoice.setSupplier(csvRow.get(8));
            results.add(invoice);
        }
        return results;
    }
}
