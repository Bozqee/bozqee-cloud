package xyz.bozqee.ums.binding;

import java.util.List;

public interface SysBindingService {

    SysBinding findByBindValue(String bindValue);

    List<SysBinding> findByUserId(Long userId);
}
