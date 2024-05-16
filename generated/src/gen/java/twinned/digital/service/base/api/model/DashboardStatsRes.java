package twinned.digital.service.base.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import twinned.digital.service.base.api.model.BaseResponse;
import twinned.digital.service.base.api.model.DashboardStats;

/**
 * DashboardStatsRes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaMSF4JServerCodegen", date = "2024-05-16T10:24:39.789+05:30")
public class DashboardStatsRes   {
  @JsonProperty("ok")
  private Boolean ok = null;

  @JsonProperty("msg")
  private String msg = null;

  @JsonProperty("trace")
  private String trace = null;

  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("totalAssets")
  private Long totalAssets = null;

  @JsonProperty("reportedAssets")
  private Long reportedAssets = null;

  public DashboardStatsRes ok(Boolean ok) {
    this.ok = ok;
    return this;
  }

   /**
   * Get ok
   * @return ok
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isOk() {
    return ok;
  }

  public void setOk(Boolean ok) {
    this.ok = ok;
  }

  public DashboardStatsRes msg(String msg) {
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @ApiModelProperty(value = "")
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public DashboardStatsRes trace(String trace) {
    this.trace = trace;
    return this;
  }

   /**
   * Get trace
   * @return trace
  **/
  @ApiModelProperty(value = "")
  public String getTrace() {
    return trace;
  }

  public void setTrace(String trace) {
    this.trace = trace;
  }

  public DashboardStatsRes errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(value = "")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public DashboardStatsRes totalAssets(Long totalAssets) {
    this.totalAssets = totalAssets;
    return this;
  }

   /**
   * Get totalAssets
   * @return totalAssets
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getTotalAssets() {
    return totalAssets;
  }

  public void setTotalAssets(Long totalAssets) {
    this.totalAssets = totalAssets;
  }

  public DashboardStatsRes reportedAssets(Long reportedAssets) {
    this.reportedAssets = reportedAssets;
    return this;
  }

   /**
   * Get reportedAssets
   * @return reportedAssets
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getReportedAssets() {
    return reportedAssets;
  }

  public void setReportedAssets(Long reportedAssets) {
    this.reportedAssets = reportedAssets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardStatsRes dashboardStatsRes = (DashboardStatsRes) o;
    return Objects.equals(this.ok, dashboardStatsRes.ok) &&
        Objects.equals(this.msg, dashboardStatsRes.msg) &&
        Objects.equals(this.trace, dashboardStatsRes.trace) &&
        Objects.equals(this.errorCode, dashboardStatsRes.errorCode) &&
        Objects.equals(this.totalAssets, dashboardStatsRes.totalAssets) &&
        Objects.equals(this.reportedAssets, dashboardStatsRes.reportedAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok, msg, trace, errorCode, totalAssets, reportedAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardStatsRes {\n");
    
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    totalAssets: ").append(toIndentedString(totalAssets)).append("\n");
    sb.append("    reportedAssets: ").append(toIndentedString(reportedAssets)).append("\n");
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

