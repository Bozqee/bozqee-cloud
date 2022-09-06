package xyz.bozqee.binding;

import xyz.bozqee.ums.binding.SysBinding;

import java.util.List;

public interface SysBindingService {

    SysBinding findByBindValue(String bindValue);

    List<SysBinding> findByUserId(Long userId);
}
