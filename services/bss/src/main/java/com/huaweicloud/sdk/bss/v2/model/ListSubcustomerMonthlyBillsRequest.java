package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListSubcustomerMonthlyBillsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cycle")
    
    private String cycle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloud_service_type")
    
    private String cloudServiceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_mode")
    
    private String chargeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_type")
    
    private String billType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;

    public ListSubcustomerMonthlyBillsRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * 客户账号ID。您可以调用查询客户列表接口获取customer_id。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    

    public ListSubcustomerMonthlyBillsRequest withCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    


    /**
     * 消费时间。 格式固定为YYYY-MM。 示例：2018-08
     * @return cycle
     */
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    

    public ListSubcustomerMonthlyBillsRequest withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    


    /**
     * 云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。您可以调用查询云服务类型列表接口获取。
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    

    public ListSubcustomerMonthlyBillsRequest withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * 计费模式。 1：包年/包月3：按需
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    

    public ListSubcustomerMonthlyBillsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 偏移量，从0开始。默认值为0。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListSubcustomerMonthlyBillsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页个数。默认值为10。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListSubcustomerMonthlyBillsRequest withBillType(String billType) {
        this.billType = billType;
        return this;
    }

    


    /**
     * 账单类型。 0：消费1：退订2：华为核销
     * @return billType
     */
    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    

    public ListSubcustomerMonthlyBillsRequest withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    


    /**
     * 精英服务商ID。
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubcustomerMonthlyBillsRequest listSubcustomerMonthlyBillsRequest = (ListSubcustomerMonthlyBillsRequest) o;
        return Objects.equals(this.customerId, listSubcustomerMonthlyBillsRequest.customerId) &&
            Objects.equals(this.cycle, listSubcustomerMonthlyBillsRequest.cycle) &&
            Objects.equals(this.cloudServiceType, listSubcustomerMonthlyBillsRequest.cloudServiceType) &&
            Objects.equals(this.chargeMode, listSubcustomerMonthlyBillsRequest.chargeMode) &&
            Objects.equals(this.offset, listSubcustomerMonthlyBillsRequest.offset) &&
            Objects.equals(this.limit, listSubcustomerMonthlyBillsRequest.limit) &&
            Objects.equals(this.billType, listSubcustomerMonthlyBillsRequest.billType) &&
            Objects.equals(this.indirectPartnerId, listSubcustomerMonthlyBillsRequest.indirectPartnerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerId, cycle, cloudServiceType, chargeMode, offset, limit, billType, indirectPartnerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubcustomerMonthlyBillsRequest {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
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

