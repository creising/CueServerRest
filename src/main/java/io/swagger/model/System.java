package io.swagger.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-10-17T19:55:06.226Z")
public class System  {
  
  private String deviceName = null;
  private String model = null;
  private String serialNumber = null;
  private String time = null;
  private Boolean hasPassword = null;

  
  /**
   * The name of the CueServer.
   **/
  @ApiModelProperty(value = "The name of the CueServer.")
  @JsonProperty("deviceName")
  public String getDeviceName() {
    return deviceName;
  }
  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  
  /**
   * The model of the CueServer.
   **/
  @ApiModelProperty(value = "The model of the CueServer.")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  
  /**
   * The serial number.
   **/
  @ApiModelProperty(value = "The serial number.")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   * The current time off of the CueServer.
   **/
  @ApiModelProperty(value = "The current time off of the CueServer.")
  @JsonProperty("time")
  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }

  
  /**
   * True if the CueServer has a password, false if not.
   **/
  @ApiModelProperty(value = "True if the CueServer has a password, false if not.")
  @JsonProperty("hasPassword")
  public Boolean getHasPassword() {
    return hasPassword;
  }
  public void setHasPassword(Boolean hasPassword) {
    this.hasPassword = hasPassword;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class System {\n");
    
    sb.append("  deviceName: ").append(deviceName).append("\n");
    sb.append("  model: ").append(model).append("\n");
    sb.append("  serialNumber: ").append(serialNumber).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  hasPassword: ").append(hasPassword).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
