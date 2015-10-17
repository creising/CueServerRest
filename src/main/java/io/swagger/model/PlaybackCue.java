package io.swagger.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-10-17T19:55:06.226Z")
public class PlaybackCue  {
  
  private BigDecimal cueNumber = null;
  private Integer playbackNumber = null;

  
  /**
   * The number of the cue to play.
   **/
  @ApiModelProperty(value = "The number of the cue to play.")
  @JsonProperty("cueNumber")
  public BigDecimal getCueNumber() {
    return cueNumber;
  }
  public void setCueNumber(BigDecimal cueNumber) {
    this.cueNumber = cueNumber;
  }

  
  /**
   * The playback to the cue will be played on.
   **/
  @ApiModelProperty(value = "The playback to the cue will be played on.")
  @JsonProperty("playbackNumber")
  public Integer getPlaybackNumber() {
    return playbackNumber;
  }
  public void setPlaybackNumber(Integer playbackNumber) {
    this.playbackNumber = playbackNumber;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaybackCue {\n");
    
    sb.append("  cueNumber: ").append(cueNumber).append("\n");
    sb.append("  playbackNumber: ").append(playbackNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
