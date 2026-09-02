package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class Contact {
    
    String accountHolder
    
    String acquisitionCost
    
    String addressSupplement
    
    String attention
    
    String bankName
    
    String bic
    
    String buyerReference
    
    String category
    
    String certificateAuthority
    
    String certificateNumber
    
    String certificateParagraph
    
    String certificateValidUntil
    
    String city
    
    String companyName
    
    String contactId
    
    Object contactPersons = null
    
    String contactType
    
    String country
    
    String createdAt
    
    String creditLimit
    
    String creditorAccountSkr03
    
    String creditorAccountSkr04
    
    String currency
    
    String customerNumber
    
    String debitorAccountSkr03
    
    String debitorAccountSkr04
    
    String defaultDebitorNumber
    
    Boolean deliveryBlock
    
    String department
    
    Integer discountDays
    
    String discountPercentage
    
    Boolean donationReceiptEligible
    
    String email
    
    String externalId
    
    String fax
    
    String iban
    
    String industry
    
    Boolean isActive
    
    Boolean isMember
    
    Boolean isNonprofit
    
    String lastContactDate
    
    String lastPurchaseDate
    
    String leitwegId
    
    String lifetimeValue
    
    String mandateDate
    
    String mandateReference
    
    Boolean marketingConsent
    
    String marketingConsentAt
    
    String marketingConsentSource
    
    String mobile
    
    String name
    
    String nextContactDate
    
    String notes
    
    String openingBalance
    
    String openingBalanceDate
    
    String orderReference
    
    Boolean paymentBlock
    
    Integer paymentGracePeriodDays
    
    List<String> paymentMethods
    
    String paymentTerms
    
    String phone
    
    Integer rating
    
    String salesRepresentative
    
    Object socialMedia = null
    
    String source
    
    String state
    
    String street
    
    String streetNumber
    
    String supplierNumber
    
    List<String> tags
    
    String taxCountry
    
    String taxNumber
    
    String taxOffice
    
    Integer totalInvoices
    
    String totalRevenue
    
    String updatedAt
    
    String vatId
    
    Boolean vatIdValidated
    
    String vatIdValidationDate
    
    String website
    
    String zip
}
