package com.bootdo.configuremanage.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * 字典类型表
 *
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-02 11:34:37
 */
public class TypeDOVO implements Serializable {
    private static final long serialVersionUID = 1L;

    //字典类型编码
    private int typeId;

    public String getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(String typeNumber) {
        this.typeNumber = typeNumber;
    }

	private List<DictionaryDO> dict;

	public List<DictionaryDO> getDict() {
		return dict;
	}

	public void setDict(List<DictionaryDO> dict) {
		this.dict = dict;
	}

    private String typeNumber;
    //字典类型名称
    private String typeName;
    //字典类型描述
    private String typeDesc;
    //创建时间
    private Date createTime;
    //创建人
    private String createBy;
    //修改时间
    private Date updateTime;
    //修改人
    private String updateBy;
    //是否可修改
    private String canEdit;

    /**
     * 设置：字典类型编码
     */
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
    /**
     * 获取：字典类型编码
     */
    public int getTypeId() {
        return typeId;
    }
    /**
     * 设置：字典类型名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    /**
     * 获取：字典类型名称
     */
    public String getTypeName() {
        return typeName;
    }
    /**
     * 设置：字典类型描述
     */
    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }
    /**
     * 获取：字典类型描述
     */
    public String getTypeDesc() {
        return typeDesc;
    }
    /**
     * 设置：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**
     * 获取：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }
    /**
     * 设置：创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
    /**
     * 获取：创建人
     */
    public String getCreateBy() {
        return createBy;
    }
    /**
     * 设置：修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
     * 获取：修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }
    /**
     * 设置：修改人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
    /**
     * 获取：修改人
     */
    public String getUpdateBy() {
        return updateBy;
    }
    /**
     * 设置：是否可修改
     */
    public void setCanEdit(String canEdit) {
        this.canEdit = canEdit;
    }
    /**
     * 获取：是否可修改
     */
    public String getCanEdit() {
        return canEdit;
    }
}
