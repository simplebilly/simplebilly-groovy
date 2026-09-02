package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CountryCode;
import org.openapitools.model.CurrencyCode;
import org.openapitools.model.DocumentType;
import org.openapitools.model.InvoiceStatus;
import org.openapitools.model.InvoiceType;
import org.openapitools.model.PaymentStatus;
import org.openapitools.model.PrecedingSalesVoucherType;

@Canonical
class InvoiceCreate {
    
    Object attachments = null
    
    Date billingPeriodEnd
    
    Date billingPeriodStart
    
    Date cancellationDate
    /* References the invoice entity. */
    String cancellationInvoiceId
    
    String cancellationReason
    /* References the contract entity. */
    UUID contractId
    
    CurrencyCode currency
    /* References the customer entity. */
    String customerId
    
    String discountAmount
    
    Integer discountDays
    
    String discountPercentage
    
    DocumentType documentType
    
    Integer dunningLevel
    
    String inputVatAmount
    
    Boolean inputVatDeductible
    
    String inputVatPercentage
    
    String introductionText
    
    InvoiceType invoiceType
    
    Boolean isCancelled
    
    Boolean isDraft
    
    Boolean isEuAcquisition
    
    Boolean isEuDelivery
    
    Boolean isIntraCommunityAcquisition
    
    Boolean isReverseCharge
    
    Date issueDate
    
    String ledgerAccount
    
    Object lineItems = null
    
    Boolean margin25a
    
    String margin25aGross
    
    String margin25aPurchasePrice
    
    String notes
    
    String orderNumber
    
    String originalPdfPath
    
    String paidAmount
    
    Date paymentDueDate
    
    PaymentStatus paymentStatus
    
    String paymentTermsText
    /* References the preceding sales voucher entity. */
    String precedingSalesVoucherId
    
    PrecedingSalesVoucherType precedingSalesVoucherType
    
    Boolean receiptConfirmationAvailable
    /* References the invoice entity. */
    UUID relatedInvoiceId
    
    String relationshipType
    
    Object senderSnapshot = null
    
    Date sentAt
    
    Date servicePeriodEnd
    
    Date servicePeriodStart
    
    InvoiceStatus status
    
    String subtotal
    /* References the supplier entity. */
    String supplierId
    
    String taxExemptionReason
    
    String totalAmount
    
    String totalTax
    
    CountryCode vatCountry
    
    String vatSpecialCase
}
