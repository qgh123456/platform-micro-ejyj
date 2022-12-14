package com.atqgh.system.provider.controller;

import com.atqgh.common.utils.ResultObj;
import com.atqgh.system.provider.dto.SysUserDto;
import com.atqgh.system.provider.service.SysUserService;
import com.atqgh.system.provider.vo.SysUserAddVo;
import com.atqgh.system.provider.vo.SysUserUptVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.Set;
import javax.annotation.Resource;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Api(tags = "用户信息")
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    /**
     * 新增用户信息.
     *
     * @param addVo     新增用户信息参数
     * @return          新增成功
     */
    @ApiOperation(value = "新增用户信息", notes = "新增用户信息", produces = "application/json")
    @PostMapping("/add")
    public ResultObj add(@ApiParam("新增参数") @Valid @RequestBody SysUserAddVo addVo) {

        this.sysUserService.insert(addVo);
        return ResultObj.ok("新增用户信息成功");
    }

    /**
     * 修改用户信息.
     *
     * @param updateVo  用户信息参数
     * @return string   修改是否成功提示信息
     */
    @PutMapping("/update")
    @ApiOperation(value = "修改用户信息", notes = "修改用户信息", produces = "application/json")
    public ResultObj update(@ApiParam("修改参数") @Valid @RequestBody SysUserUptVo updateVo) {

        this.sysUserService.update(updateVo);
        return ResultObj.ok("修改用户信息成功");
    }

    /**
     * 批量删除用户信息.
     *
     * @param pks 主键
     * @return 删除成功
     */
    @DeleteMapping("/batchDel/{pks}")
    @ApiOperation(value = "根据用户信息主键批量删除数据", notes = "根据用户信息主键批量删除数据", produces = "application/json")
    public ResultObj batchDel(@ApiParam("主键") @PathVariable(value = "pks") Set<Long> pks) {

        // 通过主键批量删除数据
        this.sysUserService.batchDel(pks);
        return ResultObj.ok("批量删除成功");
    }

    /**
    * 查看用户信息.
    *
    * @param userId 主键
    * @return 详情信息
    */
    @GetMapping("/{userId}")
    @ApiOperation(value = "根据userId主键查看数据", notes = "根据userId主键查看数据", produces = "application/json")
    public ResultObj getDetail(@PathVariable(value = "userId") Long userId) {

        // 通过主键查看数据
        SysUserDto dto = this.sysUserService.getDetail(userId);
        return ResultObj.ok().setData(dto);
    }

}
