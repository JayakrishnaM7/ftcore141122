package com.bian.core.process.model.accountdetails;

import java.util.Objects;
import com.bian.core.process.model.accountdetails.InitiateDepositsandWithdrawalsRequestCurrentAccountFacility;
import com.bian.core.process.model.accountdetails.InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateDepositsandWithdrawalsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-14T04:17:24.062Z[GMT]")

public class InitiateDepositsandWithdrawalsRequest   {
  @JsonProperty("CurrentAccountFacility")
  private InitiateDepositsandWithdrawalsRequestCurrentAccountFacility currentAccountFacility;

  @JsonProperty("DepositsandWithdrawals")
  private InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals;

  public InitiateDepositsandWithdrawalsRequest currentAccountFacility(InitiateDepositsandWithdrawalsRequestCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
    return this;
  }

  /**
   * Get currentAccountFacility
   * @return currentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateDepositsandWithdrawalsRequestCurrentAccountFacility getCurrentAccountFacility() {
    return currentAccountFacility;
  }

  public void setCurrentAccountFacility(InitiateDepositsandWithdrawalsRequestCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
  }

  public InitiateDepositsandWithdrawalsRequest depositsandWithdrawals(InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals) {
    this.depositsandWithdrawals = depositsandWithdrawals;
    return this;
  }

  /**
   * Get depositsandWithdrawals
   * @return depositsandWithdrawals
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals getDepositsandWithdrawals() {
    return depositsandWithdrawals;
  }

  public void setDepositsandWithdrawals(InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals) {
    this.depositsandWithdrawals = depositsandWithdrawals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateDepositsandWithdrawalsRequest initiateDepositsandWithdrawalsRequest = (InitiateDepositsandWithdrawalsRequest) o;
    return Objects.equals(this.currentAccountFacility, initiateDepositsandWithdrawalsRequest.currentAccountFacility) &&
        Objects.equals(this.depositsandWithdrawals, initiateDepositsandWithdrawalsRequest.depositsandWithdrawals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFacility, depositsandWithdrawals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateDepositsandWithdrawalsRequest {\n");
    
    sb.append("    currentAccountFacility: ").append(toIndentedString(currentAccountFacility)).append("\n");
    sb.append("    depositsandWithdrawals: ").append(toIndentedString(depositsandWithdrawals)).append("\n");
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

