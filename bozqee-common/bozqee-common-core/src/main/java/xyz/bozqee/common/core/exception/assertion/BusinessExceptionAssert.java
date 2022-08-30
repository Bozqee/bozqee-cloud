package xyz.bozqee.common.core.exception.assertion;

import org.apache.commons.lang3.ArrayUtils;
import xyz.bozqee.common.core.constant.IResponseEnum;
import xyz.bozqee.common.core.exception.BaseException;
import xyz.bozqee.common.core.exception.BusinessException;

import java.text.MessageFormat;

public interface BusinessExceptionAssert extends IResponseEnum, Assert {

    @Override
    default BaseException newException(Object... args) {
        String msg = this.getMessage();
        if (ArrayUtils.isNotEmpty(args)) {
            msg = MessageFormat.format(this.getMessage(), args);
        }
        return new BusinessException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable t, Object... args) {
        String msg = this.getMessage();
        if (ArrayUtils.isNotEmpty(args)) {
            msg = MessageFormat.format(this.getMessage(), args);
        }
        return new BusinessException(this, args, msg, t);
    }


}
