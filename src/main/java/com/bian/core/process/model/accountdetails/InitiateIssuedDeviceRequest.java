package com.bian.core.process.model.accountdetails;

import java.util.Objects;
import com.bian.core.process.model.accountdetails.InitiateIssuedDeviceRequestIssuedDevice;
import com.bian.core.process.model.accountdetails.InitiatePaymentsRequestCurrentAccountFacility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateIssuedDeviceRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-14T04:17:24.062Z[GMT]")

public class InitiateIssuedDeviceRequest   {
  @JsonProperty("CurrentAccountFacility")
  private InitiatePaymentsRequestCurrentAccountFacility currentAccountFacility;

  @JsonProperty("IssuedDevice")
  private InitiateIssuedDeviceRequestIssuedDevice issuedDevice;

  public InitiateIssuedDeviceRequest currentAccountFacility(InitiatePaymentsRequestCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
    return this;
  }

  /**
   * Get currentAccountFacility
   * @return currentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePaymentsRequestCurrentAccountFacility getCurrentAccountFacility() {
    return currentAccountFacility;
  }

  public void setCurrentAccountFacility(InitiatePaymentsRequestCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
  }

  public InitiateIssuedDeviceRequest issuedDevice(InitiateIssuedDeviceRequestIssuedDevice issuedDevice) {
    this.issuedDevice = issuedDevice;
    return this;
  }

  /**
   * Get issuedDevice
   * @return issuedDevice
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateIssuedDeviceRequestIssuedDevice getIssuedDevice() {
    return issuedDevice;
  }

  public void setIssuedDevice(InitiateIssuedDeviceRequestIssuedDevice issuedDevice) {
    this.issuedDevice = issuedDevice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateIssuedDeviceRequest initiateIssuedDeviceRequest = (InitiateIssuedDeviceRequest) o;
    return Objects.equals(this.currentAccountFacility, initiateIssuedDeviceRequest.currentAccountFacility) &&
        Objects.equals(this.issuedDevice, initiateIssuedDeviceRequest.issuedDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFacility, issuedDevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateIssuedDeviceRequest {\n");
    
    sb.append("    currentAccountFacility: ").append(toIndentedString(currentAccountFacility)).append("\n");
    sb.append("    issuedDevice: ").append(toIndentedString(issuedDevice)).append("\n");
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

