package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ContactType;
import org.openapitools.model.CountryCode;
import org.openapitools.model.SepaSequenceType;

@Canonical
class ContactCreate {
    
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
    
    Date certificateValidUntil
    
    String city
    
    String companyName
    
    Object contactPersons = null
    
    ContactType contactType
    
    CountryCode country
    
    String creditLimit
    
    String creditorAccountSkr03
    
    String creditorAccountSkr04
    
    String currency
    
    Object customFields = null
    
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
    
    Date lastContactDate
    
    Date lastPurchaseDate
    
    String leitwegId
    
    String lifetimeValue
    
    Date mandateDate
    
    String mandateReference
    
    Boolean marketingConsent
    
    Date marketingConsentAt
    
    String marketingConsentSource
    
    String mobile
    
    String name
    
    Date nextContactDate
    
    String notes
    
    String openingBalance
    
    Date openingBalanceDate
    
    String orderReference
    
    Boolean paymentBlock
    
    Integer paymentGracePeriodDays
    
    List<String> paymentMethods
    
    String paymentTerms
    
    String phone
    
    Integer rating
    
    String salesRepresentative
    
    Boolean sepaBatchBooking
    
    SepaSequenceType sepaSequenceType
    
    Object socialMedia = null
    
    String source
    
    String state
    
    String street
    
    String streetNumber
    
    String supplierNumber
    
    List<String> tags
    
    CountryCode taxCountry
    
    String taxNumber
    
    String taxOffice
    
    Integer totalInvoices
    
    String totalRevenue
    
    String vatId
    
    Boolean vatIdValidated
    
    Date vatIdValidationDate
    
    String website
    
    String zip
}
