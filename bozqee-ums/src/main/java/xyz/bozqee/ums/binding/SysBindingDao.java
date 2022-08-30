package xyz.bozqee.ums.binding;

import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;
import xyz.bozqee.ums.binding.SysBinding;

@Mapper
public interface SysBindingDao extends BaseMapper<SysBinding> {
}
