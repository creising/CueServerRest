package io.swagger.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-10-20T02:57:28.659Z")
public class RecordedCue  {
  
  private BigDecimal number = null;
  private BigDecimal uptime = null;
  private BigDecimal downtime = null;

  
  /**
   * the cue's numbers
   **/
  @ApiModelProperty(value = "the cue's numbers")
  @JsonProperty("number")
  public BigDecimal getNumber() {
    return number;
  }
  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  
  /**
   * the cue's uptime
   **/
  @ApiModelProperty(value = "the cue's uptime")
  @JsonProperty("uptime")
  public BigDecimal getUptime() {
    return uptime;
  }
  public void setUptime(BigDecimal uptime) {
    this.uptime = uptime;
  }

  
  /**
   * the cue's downtime
   **/
  @ApiModelProperty(value = "the cue's downtime")
  @JsonProperty("downtime")
  public BigDecimal getDowntime() {
    return downtime;
  }
  public void setDowntime(BigDecimal downtime) {
    this.downtime = downtime;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordedCue {\n");
    
    sb.append("  number: ").append(number).append("\n");
    sb.append("  uptime: ").append(uptime).append("\n");
    sb.append("  downtime: ").append(downtime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
