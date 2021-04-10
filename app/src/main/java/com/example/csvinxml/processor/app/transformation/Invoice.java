package com.example.csvinxml.processor.app.transformation;

import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType( propOrder = { "buyerName", "imageName", "invoiceImage", "invoiceDueDate", "invoiceNumber", "invoiceAmount", "invoiceCurrency", "invoiceStatus","supplier" })
@XmlRootElement(name = "Invoice")
@CsvRecord(separator = ",", skipFirstLine = true)
public class Invoice {


	@XmlAttribute(name = "buyer", required = true)
	@DataField(pos = 1)
	private String buyerName;

	@XmlAttribute(name = "image_name", required = true)
	@DataField(pos = 2)
	private String imageName;

	@XmlAttribute(name = "invoice_image", required = true)
	@DataField(pos = 3)
//	@IgnoreForToString
	private String invoiceImage;

	@XmlAttribute(name = "invoice_due_date", required = true)
//	@DataField(pos = 4)
	@DataField(pos = 4, pattern = "yyyy-MM-dd")
	private Date invoiceDueDate;

	@XmlAttribute(name = "invoice_number", required = true)
	@DataField(pos = 5)
	private String invoiceNumber;

	@XmlAttribute(name = "invoice_amount", required = true)
	@DataField(pos = 6)
	private double invoiceAmount;

	@XmlAttribute(name = "invoice_currency", required = true)
	@DataField(pos = 7)
	private String invoiceCurrency;

	@XmlAttribute(name = "invoice_status", required = true)
	@DataField(pos = 8)
	private String invoiceStatus;

	@XmlAttribute(name = "supplier", required = true)
	@DataField(pos = 9)
	private String supplier;

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getInvoiceImage() {
		return invoiceImage;
	}

	public void setInvoiceImage(String invoiceImage) {
		this.invoiceImage = invoiceImage;
	}

	public Date getInvoiceDueDate() {
		return invoiceDueDate;
	}

	public void setInvoiceDueDate(Date invoiceDueDate) {
		this.invoiceDueDate = invoiceDueDate;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceCurrency() {
		return invoiceCurrency;
	}

	public void setInvoiceCurrency(String invoiceCurrency) {
		this.invoiceCurrency = invoiceCurrency;
	}

	public String getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public Invoice() {
	}
// all args, getters, setters tostring


}
