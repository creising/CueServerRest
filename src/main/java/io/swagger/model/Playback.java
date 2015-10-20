package io.swagger.model;

import io.swagger.model.Cue;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-10-20T02:57:28.659Z")
public class Playback  {
  
  private String playback = null;
  private Cue currentCue = null;
  private Cue nextCue = null;

  
  /**
   * The ID of the playback.
   **/
  @ApiModelProperty(value = "The ID of the playback.")
  @JsonProperty("playback")
  public String getPlayback() {
    return playback;
  }
  public void setPlayback(String playback) {
    this.playback = playback;
  }

  
  /**
   * The current cue.
   **/
  @ApiModelProperty(value = "The current cue.")
  @JsonProperty("currentCue")
  public Cue getCurrentCue() {
    return currentCue;
  }
  public void setCurrentCue(Cue currentCue) {
    this.currentCue = currentCue;
  }

  
  /**
   * The next cue inlined to be played.
   **/
  @ApiModelProperty(value = "The next cue inlined to be played.")
  @JsonProperty("nextCue")
  public Cue getNextCue() {
    return nextCue;
  }
  public void setNextCue(Cue nextCue) {
    this.nextCue = nextCue;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Playback {\n");
    
    sb.append("  playback: ").append(playback).append("\n");
    sb.append("  currentCue: ").append(currentCue).append("\n");
    sb.append("  nextCue: ").append(nextCue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
