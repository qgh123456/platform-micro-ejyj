package com.atqgh.system.provider.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 字典类型表.
 *
 * @author Mubai
 * @date 2022-08-14 10:45:23
 */
@ApiModel
@Data
public class SysDictTypeDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 字典主键.
     */
    @ApiModelProperty("字典主键")
    private Long id;

    /**
     * 字典名称.
     */
    @ApiModelProperty("字典名称")
    private String dictName;

    /**
     * 字典类型.
     */
    @ApiModelProperty("字典类型")
    private String dictType;

    /**
     * 状态（0正常 1停用）.
     */
    @ApiModelProperty("状态（0正常 1停用）")
    private String status;

    /**
     * 创建者.
     */
    @ApiModelProperty("创建者")
    private String createBy;

    /**
     * 创建时间.
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 更新者.
     */
    @ApiModelProperty("更新者")
    private String updateBy;

    /**
     * 更新时间.
     */
    @ApiModelProperty("更新时间")
    private Date updateTime;

    /**
     * 备注.
     */
    @ApiModelProperty("备注")
    private String remark;

}
