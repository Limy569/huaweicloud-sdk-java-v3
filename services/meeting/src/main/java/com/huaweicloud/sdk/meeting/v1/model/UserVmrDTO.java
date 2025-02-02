package com.huaweicloud.sdk.meeting.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UserVmrDTO
 */
public class UserVmrDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrId")
    
    private String vmrId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrName")
    
    private String vmrName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrPkgId")
    
    private String vmrPkgId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrPkgName")
    
    private String vmrPkgName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrPkgParties")
    
    private Integer vmrPkgParties;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrPkgLength")
    
    private Integer vmrPkgLength;
    /**
     * 云会议室状态。 * 0.正常 * 1.停用 * 2.未分配 
     */
    public static final class StatusEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final StatusEnum NUMBER_2 = new StatusEnum(2);
        

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;

    public UserVmrDTO withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 云会议室的唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public UserVmrDTO withVmrId(String vmrId) {
        this.vmrId = vmrId;
        return this;
    }

    


    /**
     * 云会议室ID即预约会议的id，分为两种，一种是创建用户时生成的，为用户个人的，另一种是企业管理员分配的专用云会议室
     * @return vmrId
     */
    public String getVmrId() {
        return vmrId;
    }

    public void setVmrId(String vmrId) {
        this.vmrId = vmrId;
    }

    

    public UserVmrDTO withVmrName(String vmrName) {
        this.vmrName = vmrName;
        return this;
    }

    


    /**
     * 云会议室名称
     * @return vmrName
     */
    public String getVmrName() {
        return vmrName;
    }

    public void setVmrName(String vmrName) {
        this.vmrName = vmrName;
    }

    

    public UserVmrDTO withVmrPkgId(String vmrPkgId) {
        this.vmrPkgId = vmrPkgId;
        return this;
    }

    


    /**
     * 云会议室套餐包的id，仅专用云会议室返回
     * @return vmrPkgId
     */
    public String getVmrPkgId() {
        return vmrPkgId;
    }

    public void setVmrPkgId(String vmrPkgId) {
        this.vmrPkgId = vmrPkgId;
    }

    

    public UserVmrDTO withVmrPkgName(String vmrPkgName) {
        this.vmrPkgName = vmrPkgName;
        return this;
    }

    


    /**
     * 云会议室套餐包的名称，仅专用云会议室返回
     * @return vmrPkgName
     */
    public String getVmrPkgName() {
        return vmrPkgName;
    }

    public void setVmrPkgName(String vmrPkgName) {
        this.vmrPkgName = vmrPkgName;
    }

    

    public UserVmrDTO withVmrPkgParties(Integer vmrPkgParties) {
        this.vmrPkgParties = vmrPkgParties;
        return this;
    }

    


    /**
     * 云会议室套餐包的会议并发方数，仅专用云会议室返回
     * @return vmrPkgParties
     */
    public Integer getVmrPkgParties() {
        return vmrPkgParties;
    }

    public void setVmrPkgParties(Integer vmrPkgParties) {
        this.vmrPkgParties = vmrPkgParties;
    }

    

    public UserVmrDTO withVmrPkgLength(Integer vmrPkgLength) {
        this.vmrPkgLength = vmrPkgLength;
        return this;
    }

    


    /**
     * 云会议室套餐包的与会时间，若为0则代表无限时长，仅专用云会议室返回
     * @return vmrPkgLength
     */
    public Integer getVmrPkgLength() {
        return vmrPkgLength;
    }

    public void setVmrPkgLength(Integer vmrPkgLength) {
        this.vmrPkgLength = vmrPkgLength;
    }

    

    public UserVmrDTO withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 云会议室状态。 * 0.正常 * 1.停用 * 2.未分配 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserVmrDTO userVmrDTO = (UserVmrDTO) o;
        return Objects.equals(this.id, userVmrDTO.id) &&
            Objects.equals(this.vmrId, userVmrDTO.vmrId) &&
            Objects.equals(this.vmrName, userVmrDTO.vmrName) &&
            Objects.equals(this.vmrPkgId, userVmrDTO.vmrPkgId) &&
            Objects.equals(this.vmrPkgName, userVmrDTO.vmrPkgName) &&
            Objects.equals(this.vmrPkgParties, userVmrDTO.vmrPkgParties) &&
            Objects.equals(this.vmrPkgLength, userVmrDTO.vmrPkgLength) &&
            Objects.equals(this.status, userVmrDTO.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, vmrId, vmrName, vmrPkgId, vmrPkgName, vmrPkgParties, vmrPkgLength, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserVmrDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vmrId: ").append(toIndentedString(vmrId)).append("\n");
        sb.append("    vmrName: ").append(toIndentedString(vmrName)).append("\n");
        sb.append("    vmrPkgId: ").append(toIndentedString(vmrPkgId)).append("\n");
        sb.append("    vmrPkgName: ").append(toIndentedString(vmrPkgName)).append("\n");
        sb.append("    vmrPkgParties: ").append(toIndentedString(vmrPkgParties)).append("\n");
        sb.append("    vmrPkgLength: ").append(toIndentedString(vmrPkgLength)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

