package com.huaweicloud.sdk.iotda.v5.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.ConditionGroup;
import com.huaweicloud.sdk.iotda.v5.model.RuleAction;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateRuleResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule_id")
    
    private String ruleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="condition_group")
    
    private ConditionGroup conditionGroup;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="actions")
    
    private List<RuleAction> actions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule_type")
    
    private String ruleType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;

    public CreateRuleResponse withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    


    /**
     * 规则id。
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    

    public CreateRuleResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 规则名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateRuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 规则的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateRuleResponse withConditionGroup(ConditionGroup conditionGroup) {
        this.conditionGroup = conditionGroup;
        return this;
    }

    public CreateRuleResponse withConditionGroup(Consumer<ConditionGroup> conditionGroupSetter) {
        if(this.conditionGroup == null ){
            this.conditionGroup = new ConditionGroup();
            conditionGroupSetter.accept(this.conditionGroup);
        }
        
        return this;
    }


    /**
     * Get conditionGroup
     * @return conditionGroup
     */
    public ConditionGroup getConditionGroup() {
        return conditionGroup;
    }

    public void setConditionGroup(ConditionGroup conditionGroup) {
        this.conditionGroup = conditionGroup;
    }

    

    public CreateRuleResponse withActions(List<RuleAction> actions) {
        this.actions = actions;
        return this;
    }

    
    public CreateRuleResponse addActionsItem(RuleAction actionsItem) {
        if(this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public CreateRuleResponse withActions(Consumer<List<RuleAction>> actionsSetter) {
        if(this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 规则的动作列表，单个规则最多支持设置10个动作。
     * @return actions
     */
    public List<RuleAction> getActions() {
        return actions;
    }

    public void setActions(List<RuleAction> actions) {
        this.actions = actions;
    }

    

    public CreateRuleResponse withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    


    /**
     * 规则的类型 - DEVICE_LINKAGE：设备联动。 - DATA_FORWARDING：数据转发。 - EDGE：边缘侧。 
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    

    public CreateRuleResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 规则的状态，默认值：active。 - active：激活。 - inactive：未激活。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public CreateRuleResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 资源空间ID。此参数为非必选参数，存在多资源空间的用户需要使用该接口时，建议携带该参数指定创建的规则归属到哪个资源空间下，否则创建的规则将会归属到[默认资源空间](https://support.huaweicloud.com/usermanual-iothub/iot_01_0006.html#section0)下。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRuleResponse createRuleResponse = (CreateRuleResponse) o;
        return Objects.equals(this.ruleId, createRuleResponse.ruleId) &&
            Objects.equals(this.name, createRuleResponse.name) &&
            Objects.equals(this.description, createRuleResponse.description) &&
            Objects.equals(this.conditionGroup, createRuleResponse.conditionGroup) &&
            Objects.equals(this.actions, createRuleResponse.actions) &&
            Objects.equals(this.ruleType, createRuleResponse.ruleType) &&
            Objects.equals(this.status, createRuleResponse.status) &&
            Objects.equals(this.appId, createRuleResponse.appId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ruleId, name, description, conditionGroup, actions, ruleType, status, appId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRuleResponse {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    conditionGroup: ").append(toIndentedString(conditionGroup)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

