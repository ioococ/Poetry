package personal.shengyu.memory.im.http.service.impl;

import personal.shengyu.memory.im.http.entity.ImChatUserMessage;
import personal.shengyu.memory.im.http.dao.ImChatUserMessageMapper;
import personal.shengyu.memory.im.http.service.ImChatUserMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 单聊记录 服务实现类
 * </p>
 *
 * @author sara
 * @since 2021-12-02
 */
@Service
public class ImChatUserMessageServiceImpl extends ServiceImpl<ImChatUserMessageMapper, ImChatUserMessage> implements ImChatUserMessageService {

}
