package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Task
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-21T14:50:45.063Z")




public class Task   {
  @JsonProperty("taskid")
  private Long taskid = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("fromTime")
  private String fromTime = null;

  @JsonProperty("toTme")
  private String toTme = null;

  @JsonProperty("classification")
  private String classification = null;

  @JsonProperty("subClassification")
  private String subClassification = null;

  public Task taskid(Long taskid) {
    this.taskid = taskid;
    return this;
  }

  /**
   * Get taskid
   * @return taskid
  **/
  @ApiModelProperty(value = "")


  public Long getTaskid() {
    return taskid;
  }

  public void setTaskid(Long taskid) {
    this.taskid = taskid;
  }

  public Task date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Task fromTime(String fromTime) {
    this.fromTime = fromTime;
    return this;
  }

  /**
   * Get fromTime
   * @return fromTime
  **/
  @ApiModelProperty(value = "")


  public String getFromTime() {
    return fromTime;
  }

  public void setFromTime(String fromTime) {
    this.fromTime = fromTime;
  }

  public Task toTme(String toTme) {
    this.toTme = toTme;
    return this;
  }

  /**
   * Get toTme
   * @return toTme
  **/
  @ApiModelProperty(value = "")


  public String getToTme() {
    return toTme;
  }

  public void setToTme(String toTme) {
    this.toTme = toTme;
  }

  public Task classification(String classification) {
    this.classification = classification;
    return this;
  }

  /**
   * Get classification
   * @return classification
  **/
  @ApiModelProperty(value = "")


  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }

  public Task subClassification(String subClassification) {
    this.subClassification = subClassification;
    return this;
  }

  /**
   * Get subClassification
   * @return subClassification
  **/
  @ApiModelProperty(value = "")


  public String getSubClassification() {
    return subClassification;
  }

  public void setSubClassification(String subClassification) {
    this.subClassification = subClassification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.taskid, task.taskid) &&
        Objects.equals(this.date, task.date) &&
        Objects.equals(this.fromTime, task.fromTime) &&
        Objects.equals(this.toTme, task.toTme) &&
        Objects.equals(this.classification, task.classification) &&
        Objects.equals(this.subClassification, task.subClassification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskid, date, fromTime, toTme, classification, subClassification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    taskid: ").append(toIndentedString(taskid)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
    sb.append("    toTme: ").append(toIndentedString(toTme)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    subClassification: ").append(toIndentedString(subClassification)).append("\n");
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

