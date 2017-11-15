package com.gistmap.entity;

import com.gistmap.annotation.Field;
import com.gistmap.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @desc :
 * @author : gistmap
 * @date : 2017/9/28  22:42
 */
@TableName(value = "friend",  desc = "用户关系表")
public class Friend extends Entity implements Serializable{

	private static final long serialVersionUID = 6738840890442881625L;

	@Field(value="id", desc="ID")
	private Long id;
	@Field(value="bid", desc="被关注者ID")
	private Long bid;
	@Field(value="fid", desc="关注者ID")
	private Long fid;
	@Field(value="createTime", desc="创建时间")
	private LocalDateTime createTime;
	@Field(value="modifyTime", desc="修改时间")
	private LocalDateTime modifyTime;
	@Field(value="flag", desc="标记删除（默认为1,删除为0")
	private short flag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBid() {
		return bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
	}

	public Long getFid() {
		return fid;
	}

	public void setFid(Long fid) {
		this.fid = fid;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public LocalDateTime getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(LocalDateTime modifyTime) {
		this.modifyTime = modifyTime;
	}

	public short getFlag() {
		return flag;
	}

	public void setFlag(short flag) {
		this.flag = flag;
	}
}
