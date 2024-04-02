package personal.shengyu.memory.service.impl;

import personal.shengyu.memory.entity.WebInfo;
import personal.shengyu.memory.dao.WebInfoMapper;
import personal.shengyu.memory.service.WebInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 网站信息表 服务实现类
 * </p>
 *
 * @author sara
 * @since 2021-09-14
 */
@Service
public class WebInfoServiceImpl extends ServiceImpl<WebInfoMapper, WebInfo> implements WebInfoService {

}
