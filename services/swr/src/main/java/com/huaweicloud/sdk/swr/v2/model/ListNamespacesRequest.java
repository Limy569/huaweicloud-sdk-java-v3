package com.huaweicloud.sdk.swr.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListNamespacesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;

    public ListNamespacesRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 组织名称
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNamespacesRequest listNamespacesRequest = (ListNamespacesRequest) o;
        return Objects.equals(this.namespace, listNamespacesRequest.namespace);
    }
    @Override
    public int hashCode() {
        return Objects.hash(namespace);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNamespacesRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

