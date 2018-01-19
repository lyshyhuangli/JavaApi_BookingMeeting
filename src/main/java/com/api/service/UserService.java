package com.api.service;

import com.api.entity.UserDepMeetingRecord;
import org.apache.ibatis.annotations.Param;

public interface UserService
{
    /**
     * 根据phone获取用户信息
     *
     * @param phone
     * @return
     */
    UserDepMeetingRecord getUserInfoByPhone(String phone);

    /**
     * 修改用户密码
     * @param userName
     * @param pwd
     * @return
     */
    boolean modifyPwdByUserName(String userName,String pwd);

    /**
     * 保存用户信息
     * @param info
     * @return
     */
    int addUserInfo(UserDepMeetingRecord info);

    /**
     * 获取当前部门人员的最大排序号
     * @param parentId
     * @return
     */
    int getMaxPersonSort(@Param("parentId") int parentId);

    /**
     * 编辑用户信息
     * @param info
     * @return
     */
    int editUserInfo(UserDepMeetingRecord info);


}
