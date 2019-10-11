<<<<<<< HEAD:ruoyi-system/src/main/java/com/ruoyi/system/service/ISysUserOnlineService.java
package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.system.domain.SysUserOnline;
=======
package com.ruoyi.project.system.service;

import com.ruoyi.framework.security.LoginUser;
import com.ruoyi.project.monitor.domain.SysUserOnline;
>>>>>>> e235d5aa (新增在线用户):ruoyi/src/main/java/com/ruoyi/project/system/service/ISysUserOnlineService.java

/**
 * 在线用户 服务层
 * 
 * @author ruoyi
 */
public interface ISysUserOnlineService
{
    /**
     * 通过登录地址查询信息
     * 
     * @param ipaddr 登录地址
     * @param user 用户信息
     * @return 在线用户信息
     */
    public SysUserOnline selectOnlineByIpaddr(String ipaddr, LoginUser user);

    /**
     * 通过用户名称查询信息
     * 
     * @param userName 用户名称
     * @param user 用户信息
     * @return 在线用户信息
     */
    public SysUserOnline selectOnlineByUserName(String userName, LoginUser user);

    /**
     * 通过登录地址/用户名称查询信息
     * 
     * @param ipaddr 登录地址
     * @param userName 用户名称
     * @param user 用户信息
     * @return 在线用户信息
     */
    public SysUserOnline selectOnlineByInfo(String ipaddr, String userName, LoginUser user);

    /**
     * 设置在线用户信息
     * 
     * @param user 用户信息
     * @return 在线用户
     */
    public SysUserOnline loginUserToUserOnline(LoginUser user);
}
