package xyz.bozqee.binding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.bozqee.ums.binding.SysBinding;

import java.util.List;

@Service
public class SysBindingServiceImpl implements SysBindingService {

    @Autowired
    private SysBindingDao sysBindingDao;

    @Override
    public SysBinding findByBindValue(String bindValue) {
        SysBinding condition = new SysBinding();
        condition.setBindValue(bindValue);
        return sysBindingDao.selectOne(condition);
    }

    @Override
    public List<SysBinding> findByUserId(Long userId) {
        SysBinding condition = new SysBinding();
        condition.setUserId(userId);
        return sysBindingDao.select(condition);
    }

}
