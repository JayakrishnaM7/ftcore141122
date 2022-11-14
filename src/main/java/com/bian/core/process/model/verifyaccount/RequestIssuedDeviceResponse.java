package com.bian.core.process.model.verifyaccount;

import java.util.Objects;
import com.bian.core.process.model.verifyaccount.InitiateIssuedDeviceResponseIssuedDevice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestIssuedDeviceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-14T04:17:24.062Z[GMT]")

public class RequestIssuedDeviceResponse   {
  @JsonProperty("IssuedDevice")
  private InitiateIssuedDeviceResponseIssuedDevice issuedDevice;

  public RequestIssuedDeviceResponse issuedDevice(InitiateIssuedDeviceResponseIssuedDevice issuedDevice) {
    this.issuedDevice = issuedDevice;
    return this;
  }

  /**
   * Get issuedDevice
   * @return issuedDevice
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateIssuedDeviceResponseIssuedDevice getIssuedDevice() {
    return issuedDevice;
  }

  public void setIssuedDevice(InitiateIssuedDeviceResponseIssuedDevice issuedDevice) {
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
    RequestIssuedDeviceResponse requestIssuedDeviceResponse = (RequestIssuedDeviceResponse) o;
    return Objects.equals(this.issuedDevice, requestIssuedDeviceResponse.issuedDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestIssuedDeviceResponse {\n");
    
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

