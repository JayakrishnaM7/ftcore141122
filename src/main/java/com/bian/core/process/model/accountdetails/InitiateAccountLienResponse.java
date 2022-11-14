package com.bian.core.process.model.accountdetails;

import java.util.Objects;
import com.bian.core.process.model.accountdetails.InitiateAccountLienResponseAccountLien;
import com.bian.core.process.model.accountdetails.InitiateAccountLienResponseCurrentAccountFacility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAccountLienResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-14T04:17:24.062Z[GMT]")

public class InitiateAccountLienResponse   {
  @JsonProperty("CurrentAccountFacility")
  private InitiateAccountLienResponseCurrentAccountFacility currentAccountFacility;

  @JsonProperty("AccountLien")
  private InitiateAccountLienResponseAccountLien accountLien;

  public InitiateAccountLienResponse currentAccountFacility(InitiateAccountLienResponseCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
    return this;
  }

  /**
   * Get currentAccountFacility
   * @return currentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAccountLienResponseCurrentAccountFacility getCurrentAccountFacility() {
    return currentAccountFacility;
  }

  public void setCurrentAccountFacility(InitiateAccountLienResponseCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
  }

  public InitiateAccountLienResponse accountLien(InitiateAccountLienResponseAccountLien accountLien) {
    this.accountLien = accountLien;
    return this;
  }

  /**
   * Get accountLien
   * @return accountLien
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAccountLienResponseAccountLien getAccountLien() {
    return accountLien;
  }

  public void setAccountLien(InitiateAccountLienResponseAccountLien accountLien) {
    this.accountLien = accountLien;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateAccountLienResponse initiateAccountLienResponse = (InitiateAccountLienResponse) o;
    return Objects.equals(this.currentAccountFacility, initiateAccountLienResponse.currentAccountFacility) &&
        Objects.equals(this.accountLien, initiateAccountLienResponse.accountLien);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFacility, accountLien);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountLienResponse {\n");
    
    sb.append("    currentAccountFacility: ").append(toIndentedString(currentAccountFacility)).append("\n");
    sb.append("    accountLien: ").append(toIndentedString(accountLien)).append("\n");
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

