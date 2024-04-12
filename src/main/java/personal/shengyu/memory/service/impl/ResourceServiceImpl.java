package personal.shengyu.memory.service.impl;

import personal.shengyu.memory.domain.Resource;
import personal.shengyu.memory.dao.ResourceMapper;
import personal.shengyu.memory.service.ResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源信息 服务实现类
 * </p>
 *
 * @author sara
 * @since 2022-03-06
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements ResourceService {

}
