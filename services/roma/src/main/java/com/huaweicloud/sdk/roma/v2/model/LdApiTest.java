package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.LdApiParameterTest;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * LdApiTest
 */
public class LdApiTest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameters")
    
    private List<LdApiParameterTest> parameters = null;
    
    public LdApiTest withParameters(List<LdApiParameterTest> parameters) {
        this.parameters = parameters;
        return this;
    }

    
    public LdApiTest addParametersItem(LdApiParameterTest parametersItem) {
        if(this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public LdApiTest withParameters(Consumer<List<LdApiParameterTest>> parametersSetter) {
        if(this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 后端API请求参数
     * @return parameters
     */
    public List<LdApiParameterTest> getParameters() {
        return parameters;
    }

    public void setParameters(List<LdApiParameterTest> parameters) {
        this.parameters = parameters;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LdApiTest ldApiTest = (LdApiTest) o;
        return Objects.equals(this.parameters, ldApiTest.parameters);
    }
    @Override
    public int hashCode() {
        return Objects.hash(parameters);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LdApiTest {\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

