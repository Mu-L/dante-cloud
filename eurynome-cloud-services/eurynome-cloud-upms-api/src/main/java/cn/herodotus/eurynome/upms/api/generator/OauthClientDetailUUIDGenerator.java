package cn.herodotus.eurynome.upms.api.generator;

import cn.herodotus.eurynome.upms.api.entity.system.SysClientDetail;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.UUIDGenerator;

import java.io.Serializable;

/**
 * <p> Description : 使得保存实体类时可以在保留主键生成策略的情况下自定义表的主键 </p>
 *
 * @author : gengwei.zheng
 * @date : 2020/2/22 13:16
 */
public class OauthClientDetailUUIDGenerator extends UUIDGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        if (ObjectUtils.isEmpty(object)) {
            throw new HibernateException(new NullPointerException());
        }

        SysClientDetail oauthClientDetail = (SysClientDetail) object;

        if (StringUtils.isEmpty(oauthClientDetail.getClientId())) {
            return super.generate(session, object);
        } else {
            return oauthClientDetail.getClientId();
        }
    }
}
