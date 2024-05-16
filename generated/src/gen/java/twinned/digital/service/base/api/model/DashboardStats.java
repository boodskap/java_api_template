package twinned.digital.service.base.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DashboardStats
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaMSF4JServerCodegen", date = "2024-05-16T10:24:39.789+05:30")
public class DashboardStats   {
  @JsonProperty("totalAssets")
  private Long totalAssets = null;

  @JsonProperty("reportedAssets")
  private Long reportedAssets = null;

  public DashboardStats totalAssets(Long totalAssets) {
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

  public DashboardStats reportedAssets(Long reportedAssets) {
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
    DashboardStats dashboardStats = (DashboardStats) o;
    return Objects.equals(this.totalAssets, dashboardStats.totalAssets) &&
        Objects.equals(this.reportedAssets, dashboardStats.reportedAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAssets, reportedAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardStats {\n");
    
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

