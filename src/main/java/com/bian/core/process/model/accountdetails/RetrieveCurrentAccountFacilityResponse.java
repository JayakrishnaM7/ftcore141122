package com.bian.core.process.model.accountdetails;

import java.util.Objects;
import com.bian.core.process.model.accountdetails.UpdateCurrentAccountFacilityRequestCurrentAccountFacility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveCurrentAccountFacilityResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-14T04:17:24.062Z[GMT]")

public class RetrieveCurrentAccountFacilityResponse   {
  @JsonProperty("CurrentAccountFacility")
  private UpdateCurrentAccountFacilityRequestCurrentAccountFacility currentAccountFacility;

  public RetrieveCurrentAccountFacilityResponse currentAccountFacility(UpdateCurrentAccountFacilityRequestCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
    return this;
  }

  /**
   * Get currentAccountFacility
   * @return currentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateCurrentAccountFacilityRequestCurrentAccountFacility getCurrentAccountFacility() {
    return currentAccountFacility;
  }

  public void setCurrentAccountFacility(UpdateCurrentAccountFacilityRequestCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveCurrentAccountFacilityResponse retrieveCurrentAccountFacilityResponse = (RetrieveCurrentAccountFacilityResponse) o;
    return Objects.equals(this.currentAccountFacility, retrieveCurrentAccountFacilityResponse.currentAccountFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFacility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveCurrentAccountFacilityResponse {\n");
    
    sb.append("    currentAccountFacility: ").append(toIndentedString(currentAccountFacility)).append("\n");
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

