package xyz.bozqee.account;

import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;
import xyz.bozqee.ums.account.SysAccount;

@Mapper
public interface SysAccountDao extends BaseMapper<SysAccount> {
}
