package com.bian.core.process.model.fundtransferinitiate;

import java.util.Objects;
import com.bian.core.process.model.fundtransferinitiate.UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdatePaymentInitiationTransactionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-14T04:17:13.353Z[GMT]")

public class UpdatePaymentInitiationTransactionRequest   {
  @JsonProperty("PaymentInitiationTransaction")
  private UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction paymentInitiationTransaction;

  public UpdatePaymentInitiationTransactionRequest paymentInitiationTransaction(UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction paymentInitiationTransaction) {
    this.paymentInitiationTransaction = paymentInitiationTransaction;
    return this;
  }

  /**
   * Get paymentInitiationTransaction
   * @return paymentInitiationTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction getPaymentInitiationTransaction() {
    return paymentInitiationTransaction;
  }

  public void setPaymentInitiationTransaction(UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction paymentInitiationTransaction) {
    this.paymentInitiationTransaction = paymentInitiationTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentInitiationTransactionRequest updatePaymentInitiationTransactionRequest = (UpdatePaymentInitiationTransactionRequest) o;
    return Objects.equals(this.paymentInitiationTransaction, updatePaymentInitiationTransactionRequest.paymentInitiationTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInitiationTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentInitiationTransactionRequest {\n");
    
    sb.append("    paymentInitiationTransaction: ").append(toIndentedString(paymentInitiationTransaction)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

