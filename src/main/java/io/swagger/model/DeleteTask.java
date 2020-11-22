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
 * DeleteTask
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-21T14:50:45.063Z")




public class DeleteTask   {
  @JsonProperty("taskid")
  private Long taskid = null;

  public DeleteTask taskid(Long taskid) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteTask deleteTask = (DeleteTask) o;
    return Objects.equals(this.taskid, deleteTask.taskid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteTask {\n");
    
    sb.append("    taskid: ").append(toIndentedString(taskid)).append("\n");
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

